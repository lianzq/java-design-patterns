package cn.lzq.designpatterns.singleton;

/**
 * 静态内部类
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class SingletonHolder {
        private final static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
