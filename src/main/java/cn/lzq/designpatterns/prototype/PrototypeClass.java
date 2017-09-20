package cn.lzq.designpatterns.prototype;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public class PrototypeClass implements Cloneable {

    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
