package cn.lzq.designpatterns.decorator;

/**
 * @author lianzhiqiang
 * Created in 2017/10/16
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do Something");
    }
}
