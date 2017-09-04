package cn.lzq.designpatterns.singleton;

/**
 * 饿汉，另一种形式
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class InitAtStaticSingleton {

    private static InitAtStaticSingleton instance = null;

    static {
        instance = new InitAtStaticSingleton();
    }

    private InitAtStaticSingleton() {
    }

    public InitAtStaticSingleton getInstance() {
        return instance;
    }
}
