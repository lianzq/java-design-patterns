package cn.lzq.designpatterns.command;

/**
 * @author lianzhiqiang
 * Created in 2017/9/21
 */
public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        Receiver receiver = new ConcreteReceiver1();

        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);

        invoker.action();

        Receiver receiver2 = new ConcreteReceiver2();

        Command command2 = new ConcreteCommand2(receiver2);

        invoker.setCommand(command2);

        invoker.action();
    }
}
