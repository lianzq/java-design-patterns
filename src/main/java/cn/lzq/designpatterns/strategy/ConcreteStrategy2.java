package cn.lzq.designpatterns.strategy;

/**
 * @author lianzhiqiang
 * Created in 2017/10/17
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略2的运算法则");
    }
}
