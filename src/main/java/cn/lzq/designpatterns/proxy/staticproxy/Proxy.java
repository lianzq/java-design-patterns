package cn.lzq.designpatterns.proxy.staticproxy;

/**
 * @author lianzhiqiang
 * Created in 2017/9/13
 */
public class Proxy implements Subject {

    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Object... objects) {
    }

    public Proxy(Object _subject) {
        this.subject = (Subject) _subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    //预处理
    private void before() {
        //doSomething
    }

    //善后处理
    private void after() {
    }
}
