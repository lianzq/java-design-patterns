package cn.lzq.designpatterns.mediator;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.setC1(c1);
        mediator.setC2(c2);

        c1.method1();
        c1.depMethod1();

        c2.method2();
        c2.depMethod2();

    }
}
