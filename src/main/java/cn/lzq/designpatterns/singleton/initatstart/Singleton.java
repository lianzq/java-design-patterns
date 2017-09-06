package cn.lzq.designpatterns.singleton.initatstart;

/**
 * 饿汉
 * 没有懒加载
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
