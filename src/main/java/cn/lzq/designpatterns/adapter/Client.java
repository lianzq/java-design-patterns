package cn.lzq.designpatterns.adapter;

/**
 * @author lianzhiqiang
 * Created in 2017/10/19
 */
public class Client {

    public static void main(String[] args) {
        //原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        //适配后的业务逻辑
        Target target2 = new Adapter();
        target2.request();
    }
}
