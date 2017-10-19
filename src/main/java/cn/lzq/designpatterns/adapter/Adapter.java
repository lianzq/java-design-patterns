package cn.lzq.designpatterns.adapter;

/**
 * @author lianzhiqiang
 * Created in 2017/10/19
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
