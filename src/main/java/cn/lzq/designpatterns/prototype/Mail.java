package cn.lzq.designpatterns.prototype;

/**
 * @author lianzhiqiang
 * Created in 2017/9/20
 */
public class Mail implements Cloneable {

    private String recerver;
    private String subject;
    private String context;

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }

    public String getRecerver() {
        return recerver;
    }

    public void setRecerver(String recerver) {
        this.recerver = recerver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "recerver='" + recerver + '\'' +
                ", subject='" + subject + '\'' +
                ", context='" + context + '\'' +
                '}';
    }

    public static void main(String[] args) {
        int num = 6;
        int i = 0;
        Mail mail = new Mail();
        mail.setContext("恭喜！您在今天吃抽奖活动中，获得30元优惠券！请登录app领取。");
        while (i < num) {

            Mail cloneMail = mail.clone();
            cloneMail.setRecerver("先生" + i);
            cloneMail.setSubject("" + i);

            System.out.println(cloneMail.toString());
            i++;
        }
    }
}
