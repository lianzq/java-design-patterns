package cn.lzq.designpatterns.factory.abstractfactory;

/**
 * @author lianzhiqiang
 * Created in 2017/9/7
 */
public interface AbstractFactory {
    ProductAI createProductA();

    ProductBI createProductB();
}
