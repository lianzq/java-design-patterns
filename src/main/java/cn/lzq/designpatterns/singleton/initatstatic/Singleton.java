package cn.lzq.designpatterns.singleton.initatstatic;

/**
 * 饿汉，另一种形式
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class Singleton {

    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    private Singleton() {
    }

    public Singleton getInstance() {
        return instance;
    }
}
