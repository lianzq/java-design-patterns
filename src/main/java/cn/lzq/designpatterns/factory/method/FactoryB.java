package cn.lzq.designpatterns.factory.method;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class FactoryB implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
