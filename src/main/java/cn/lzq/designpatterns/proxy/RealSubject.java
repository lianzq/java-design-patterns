package cn.lzq.designpatterns.proxy;

/**
 * @author lianzhiqiang
 * Created in 2017/9/13
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        //真实业务处理逻辑
    }
}
