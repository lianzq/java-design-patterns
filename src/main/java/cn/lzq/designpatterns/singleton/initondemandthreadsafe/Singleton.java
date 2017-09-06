package cn.lzq.designpatterns.singleton.initondemandthreadsafe;

/**
 * 懒汉，线程安全
 * 懒加载，多线程下线程安全，但是大多数情况下不需要同步
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
