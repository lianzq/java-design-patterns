package cn.lzq.designpatterns.factory.abstractfactory;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new Factory1();
        ProductAI productA1 = factory1.createProductA();
        productA1.productName();
        ProductBI productB1 = factory1.createProductB();
        productB1.productName();
        //
        AbstractFactory factory2 = new Factory2();
        ProductAI productA2 = factory2.createProductA();
        productA2.productName();
        ProductBI productB2 = factory2.createProductB();
        productB2.productName();
    }
}
