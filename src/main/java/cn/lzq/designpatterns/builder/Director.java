package cn.lzq.designpatterns.builder;

/**
 * @author lianzhiqiang
 * Created in 2017/9/12
 */
public class Director {

    private Builder builder = new ConcreteProduct();

    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
