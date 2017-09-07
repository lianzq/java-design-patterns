package cn.lzq.designpatterns.factory.simple;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class Client {

    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.create();
        productA.productName();
        //
        Factory factoryB = new FactoryB();
        Product productB = factoryB.create();
        productB.productName();
    }
}
