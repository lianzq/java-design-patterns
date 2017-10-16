package cn.lzq.designpatterns.decorator;

/**
 * @author lianzhiqiang
 * Created in 2017/10/16
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void method1() {
        System.out.println("method1 修饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
