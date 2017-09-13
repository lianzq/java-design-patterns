package cn.lzq.designpatterns.proxy.dynamicproxy;

import cn.lzq.designpatterns.proxy.Greeting;
import cn.lzq.designpatterns.proxy.SayHello;
import cn.lzq.designpatterns.proxy.ShakeHands;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lianzhiqiang
 * Created in 2017/9/13
 */
public class JdkProxy implements InvocationHandler {


    private Object target;

    public JdkProxy(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        before();
        result = method.invoke(target, args);
        after();
        return result;
    }

    public void before() {
        System.out.println("[JdkProxy] Come to someone.");
    }

    public void after() {
        System.out.println("[JdkProxy] Back to his own corner");
    }

    //测试调用
    public static void main(String[] args) {
        Greeting hello = new SayHello();
        Greeting shakeHands = new ShakeHands();


        //jdk动态代理
        JdkProxy dynamicProxy = new JdkProxy(hello);
        Greeting target = (Greeting) Proxy.newProxyInstance(hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(), dynamicProxy);
        target.doGreet();
        System.out.println();

        JdkProxy dynamicProxy2 = new JdkProxy(shakeHands);
        Greeting target2 = (Greeting) Proxy.newProxyInstance(shakeHands.getClass().getClassLoader(),
                shakeHands.getClass().getInterfaces(), dynamicProxy2);
        target2.doGreet();
    }
}
