package method;

/**
 * @ClassName: Consumer
 * @Date: 2020/5/11 12:22
 * @Description: 消费者
 */
public class Consumer {
    public static void main(String[] args) {
        Car wuLing = new WuLingFactory().getCar();
        Car tesla = new TeslaFactory().getCar();
        wuLing.name();
        tesla.name();

        //新增一个摩拜，不需要像简单工厂那样修改代码
        Car moBai = new MoBaiFactory().getCar();
        moBai.name();
    }
}
