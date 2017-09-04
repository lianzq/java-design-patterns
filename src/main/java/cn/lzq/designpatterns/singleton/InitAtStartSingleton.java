package cn.lzq.designpatterns.singleton;

/**
 * 饿汉
 * 没有懒加载
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class InitAtStartSingleton {

    private static InitAtStartSingleton instance = new InitAtStartSingleton();

    private InitAtStartSingleton() {
    }

    public static InitAtStartSingleton getInstance() {
        return instance;
    }
}
