package cn.lzq.designpatterns.responsibilitychain;

/**
 * @author lianzhiqiang
 * Created in 2017/9/28
 */
public class ConcreteHandler1 extends Handler {


    // 定义自己的处理逻辑
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    @Override
    protected Response echo(Request request) {
        return null;
    }


}
