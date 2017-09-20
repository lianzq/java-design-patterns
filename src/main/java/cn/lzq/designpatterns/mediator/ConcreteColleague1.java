package cn.lzq.designpatterns.mediator;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void method1() {
        System.out.println("同事A在工作。。。");
    }

    public void depMethod1() {
        super.mediator.doSomething1();
    }
}
