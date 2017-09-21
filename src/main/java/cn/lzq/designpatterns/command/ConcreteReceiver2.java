package cn.lzq.designpatterns.command;

/**
 * @author lianzhiqiang
 * Created in 2017/9/21
 */
public class ConcreteReceiver2 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiver2 is doing something...");
    }
}
