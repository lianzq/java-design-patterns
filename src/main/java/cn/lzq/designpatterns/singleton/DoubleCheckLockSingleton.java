package cn.lzq.designpatterns.singleton;

/**
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }

        return instance;
    }
}
