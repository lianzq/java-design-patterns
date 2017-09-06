package cn.lzq.designpatterns.singleton.doublechecklock;

/**
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
