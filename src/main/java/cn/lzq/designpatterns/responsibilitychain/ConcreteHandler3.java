package cn.lzq.designpatterns.responsibilitychain;

/**
 * @author lianzhiqiang
 * Created in 2017/9/28
 */
public class ConcreteHandler3 extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }
}
