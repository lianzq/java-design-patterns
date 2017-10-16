package cn.lzq.designpatterns.decorator;

/**
 * @author lianzhiqiang
 * Created in 2017/10/16
 */
public abstract class Decorator extends Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
