package cn.lzq.designpatterns.command;

/**
 * @author lianzhiqiang
 * Created in 2017/9/21
 */
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
