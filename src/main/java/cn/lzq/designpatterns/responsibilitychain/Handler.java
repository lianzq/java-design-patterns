package cn.lzq.designpatterns.responsibilitychain;

/**
 * @author lianzhiqiang
 * Created in 2017/9/28
 */
public abstract class Handler {

    private Handler nextHandler;

    //每个处理者都必须对请求做出处理
    public final Response handlerMessage(Request request) {

        Response response = null;
        //判断处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            // 不属于自己的处理级别
            // 判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handlerMessage(request);
            } else {
                //没有处理者
            }

        }
        return response;
    }

    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    //级别
    protected abstract Level getHandlerLevel();

    //
    protected abstract Response echo(Request request);

}
