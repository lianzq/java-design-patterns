package cn.lzq.designpatterns.factory.simple;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public class FactoryA implements Factory {

    @Override
    public Product create() {
        return new ProductA();
    }
}
