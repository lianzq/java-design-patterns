package cn.lzq.designpatterns.strategy;

/**
 * @author lianzhiqiang
 * Created in 2017/10/17
 */
public class Context {

    private Strategy strategy = null;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        this.strategy.doSomething();
    }
}
