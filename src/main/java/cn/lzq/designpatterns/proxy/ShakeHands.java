package cn.lzq.designpatterns.proxy;

/**
 * @author lianzhiqiang
 * Created in 2017/9/13
 */
public class ShakeHands implements Greeting {
    @Override
    public void doGreet() {
        System.out.println("Greeting by shake others's hands .");
    }
}
