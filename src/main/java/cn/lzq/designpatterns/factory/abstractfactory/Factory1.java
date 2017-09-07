package cn.lzq.designpatterns.factory.abstractfactory;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class Factory1 implements AbstractFactory {
    @Override
    public ProductAI createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductBI createProductB() {
        return new ProductB1();
    }
}
