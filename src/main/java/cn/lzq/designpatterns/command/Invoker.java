package cn.lzq.designpatterns.command;

/**
 * @author lianzhiqiang
 * Created in 2017/9/21
 */
class Invoker {
    private Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void action() {
        this.command.execute();
    }
}
