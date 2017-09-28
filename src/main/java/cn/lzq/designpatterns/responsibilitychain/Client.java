package cn.lzq.designpatterns.responsibilitychain;

/**
 * @author lianzhiqiang
 * Created in 2017/9/28
 */
public class Client {

    public static void main(String[] args) {
        //声明所有处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler1();
        Handler handler3 = new ConcreteHandler1();

        //设定链中的阶段书序1--》2--》3
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        //提交请求，返回结果
        handler1.handlerMessage(new Request());

    }
}
