package cn.lzq.designpatterns.factory.abstractfactory2;

import cn.lzq.designpatterns.factory.method.ProductA;
import cn.lzq.designpatterns.factory.method.ProductB;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory productFactory = new ProductFactory();
        ProductA productA = productFactory.createProduct(ProductA.class);
        productA.productName();
        //
        ProductB productB = productFactory.createProduct(ProductB.class);
        productB.productName();

    }
}
