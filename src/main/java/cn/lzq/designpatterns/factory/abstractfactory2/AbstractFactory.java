package cn.lzq.designpatterns.factory.abstractfactory2;

import cn.lzq.designpatterns.factory.method.Product;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public interface AbstractFactory {
    <T extends Product> T createProduct(Class<T> c);
}
