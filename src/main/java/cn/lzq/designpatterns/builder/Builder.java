package cn.lzq.designpatterns.builder;

/**
 * @author lianzhiqiang
 * Created in 2017/9/12
 */
public abstract class Builder {

    public abstract void setPart();

    public abstract Product buildProduct();
}
