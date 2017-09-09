package cn.lzq.designpatterns.abstractclass;

/**
 * 定义一个操作中算法的框架，而将一些步骤延迟到子类中
 * 使得子类可以不改变算法的结构即可重定义该算法的某些特定步骤
 *
 * @author lianzhiqiang
 * Created in 2017/9/9
 */
public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public void templateMethod() {
        /**
         * 调用基本方法
         */
        this.doSomething();
        this.doAnything();
    }

}
