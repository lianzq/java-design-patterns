package cn.lzq.designpatterns.factory.simple;

import cn.lzq.designpatterns.factory.method.ProductA;
import cn.lzq.designpatterns.factory.method.ProductB;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class Client {

    public static void main(String[] args) {
        ProductA productA = ProductFactory.createProduct(ProductA.class);
        productA.productName();
        //
        ProductB productB = ProductFactory.createProduct(ProductB.class);
        productB.productName();

    }
}
