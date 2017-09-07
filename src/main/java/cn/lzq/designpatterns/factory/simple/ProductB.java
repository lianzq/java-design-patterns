package cn.lzq.designpatterns.factory.simple;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class ProductB implements Product {
    @Override
    public void productName() {
        System.out.println("product B");
    }
}
