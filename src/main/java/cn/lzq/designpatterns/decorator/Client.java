package cn.lzq.designpatterns.decorator;

/**
 * @author lianzhiqiang
 * Created in 2017/10/16
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修饰
        component = new ConcreteDecorator1(component);
        //第二次修饰
        component = new ConcreteDecorator2(component);

        component.operate();
    }
}
