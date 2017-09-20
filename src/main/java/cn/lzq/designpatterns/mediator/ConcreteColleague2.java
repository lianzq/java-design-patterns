package cn.lzq.designpatterns.mediator;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void method2() {
        System.out.println("同事B在工作。。。");
    }

    public void depMethod2() {
        super.mediator.doSomething2();
    }
}
