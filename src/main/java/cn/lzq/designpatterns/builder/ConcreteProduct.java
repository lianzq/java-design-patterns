package cn.lzq.designpatterns.builder;

/**
 * @author lianzhiqiang
 * Created in 2017/9/12
 */
public class ConcreteProduct extends Builder {

    private Product product = new Product();

    @Override
    public void setPart() {

    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
