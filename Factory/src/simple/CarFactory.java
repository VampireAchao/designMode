package simple;

/**
 * @ClassName: CarFactory
 * @Date: 2020/5/11 12:24
 * @Description: 简单工厂模式 静态工厂模式
 * 好处是降低耦合，消费者不需要直接去创建汽车对象，而是通过汽车工厂对象创建
 */
public class CarFactory {
    public static Car getCar(String car) {
        if (car.equals("五菱")) {             //如果输入的值为五菱
            return new WuLing();
        } else if (car.equals("特斯拉")) {     //如果输入的值为特斯拉
            return new Tesla();
        } else {
            return null;
        }
    }

    /**
     * 获取五菱
     * @return
     */
    public static Car getWuLing() {
        return new WuLing();
    }

    /**
     * 获取特斯拉
     * @return
     */
    public static Car getTesla() {
        return new Tesla();
    }
    //当我们新加一个大众（汽车）的时候，需要来改代码，不满足我们的开闭原则(对接口开放，对修改关闭)
}
