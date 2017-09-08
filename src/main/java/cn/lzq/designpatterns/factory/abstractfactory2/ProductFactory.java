package cn.lzq.designpatterns.factory.abstractfactory2;

import cn.lzq.designpatterns.factory.method.Product;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class ProductFactory implements AbstractFactory {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("product 错误");
        }
        return (T) product;
    }
}
