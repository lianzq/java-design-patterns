package cn.lzq.designpatterns.factory.method;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class ProductA implements Product {
    @Override
    public void productName() {
        System.out.println("product A");
    }
}
