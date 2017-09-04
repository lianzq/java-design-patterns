package cn.lzq.designpatterns.singleton;

/**
 * 懒汉，线程不安全
 * 虽然懒加载，但是多线程不能正常工作
 *
 * @author lianzhiqiang
 * Created in 2017/9/4
 */
public class InitOnDemandThreadNotSafeSingleton {
    private static InitOnDemandThreadNotSafeSingleton instance;

    private InitOnDemandThreadNotSafeSingleton() {
    }

    public static InitOnDemandThreadNotSafeSingleton getInstance() {
        if (instance == null) {
            instance = new InitOnDemandThreadNotSafeSingleton();
        }
        return instance;
    }
}
