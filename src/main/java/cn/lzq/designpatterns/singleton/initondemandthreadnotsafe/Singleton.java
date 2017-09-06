package cn.lzq.designpatterns.singleton.initondemandthreadnotsafe;

/**
 * 懒汉，线程不安全
 * 虽然懒加载，但是多线程不能正常工作
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
