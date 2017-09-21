package cn.lzq.designpatterns.command;

/**
 * @author lianzhiqiang
 * Created in 2017/9/21
 */
public class ConcreteReceiver1 extends Receiver {
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiver1 is doing something...");
    }
}
