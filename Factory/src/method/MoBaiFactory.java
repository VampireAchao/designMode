package method;

/**
 * @ClassName: MoBaiFactory
 * @Date: 2020/5/11 13:16
 * @Description: 摩拜工厂
 */
public class MoBaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
