package cn.lzq.designpatterns.mediator;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        super.c1.method1();
        super.c2.method2();
    }

    @Override
    public void doSomething2() {
        super.c1.method1();
        super.c2.method2();
    }
}