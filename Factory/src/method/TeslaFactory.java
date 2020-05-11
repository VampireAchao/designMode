package method;

/**
 * @ClassName: TeslaFactory
 * @Date: 2020/5/11 13:06
 * @Description: 特斯拉工厂
 */
public class TeslaFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
