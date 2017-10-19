package cn.lzq.designpatterns.adapter;

/**
 * @author lianzhiqiang
 * Created in 2017/10/19
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println(" 不论什么事，请找我！");
    }
}
