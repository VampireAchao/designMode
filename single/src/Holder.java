/**
 * @ClassName: Holder
 * @Date: 2020/5/9 17:34
 * @Description: 静态内部类
 */
public class Holder {

    //构造器私有
    private Holder() {
    }

    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }
}
