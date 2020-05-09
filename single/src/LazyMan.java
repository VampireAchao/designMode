/**
 * @ClassName: LazyMan
 * @Date: 2020/5/9 17:20
 * @Description: 懒汉式单例
 */
public class LazyMan {
    /**
     * 因为它不是一个原子性操作
     * 所以有可能第二个线程过来的时候LazyMan还没有完成构造（此时判断lazyMan存在但其实还没完成）
     * 导致直接return lazyMan(此时lazyMan为null)
     * 因此需要在静态变量前加volatile关键字
     */
    private volatile static LazyMan lazyMan;

    private static boolean hasInstance = false;

    //构造器私有
    private LazyMan() {
        //防止用反射创建多个单例
        if (hasInstance == false) {
            hasInstance = true;
        } else {
            throw new RuntimeException("不要试图使用反射破坏单例!");
        }
/*        //防止用反射创建第二个单例
        synchronized (LazyMan.class) {
            if (lazyMan != null) {
                throw new RuntimeException("不要试图使用反射破坏单例!");
            }
        }*/
    }

    /**
     * 双重检测锁模式的懒汉式单例    （DCL懒汉式）
     *
     * @return
     */
    public LazyMan getInstance() {
        //为了防止多线程下失效，所以升级为双重检测锁
        //先判断是否为null
        if (lazyMan == null) {
            //如果为null则给LazyMan对象加锁
            synchronized (LazyMan.class) {
                //判断是否存在LazyMan对象，如果没有再new
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }
}
