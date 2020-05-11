package method;

/**
 * @ClassName: TeslaFactory
 * @Date: 2020/5/11 13:06
 * @Description: 五菱工厂
 */
public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
