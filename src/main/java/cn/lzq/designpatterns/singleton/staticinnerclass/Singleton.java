package cn.lzq.designpatterns.singleton.staticinnerclass;

/**
 * 静态内部类
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
