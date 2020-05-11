package method;

/**
 * @ClassName: MoBai
 * @Date: 2020/5/11 13:15
 * @Description: 新创建的一个车，不需要修改工厂的代码
 */
public class MoBai implements Car {
    @Override
    public void name() {
        System.out.println("摩拜");
    }
}
