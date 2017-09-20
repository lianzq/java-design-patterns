package cn.lzq.designpatterns.mediator;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
