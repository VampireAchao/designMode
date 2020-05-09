/**
 * @ClassName: Hungry
 * @Date: 2020/5/9 17:16
 * @Description: 饿汉式
 */
public class Hungry {
    //构造器私有
    private Hungry() {

    }
    //一上来就new出来这个对象，可能会浪费空间
    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }
}
