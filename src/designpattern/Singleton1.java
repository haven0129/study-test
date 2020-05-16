package designpattern;

/**
 * @author tao.huang
 * @date 2020-05-13 17:55
 * 单例模式:饿汉
 * 线程安全
 * 非懒加载
 */
public class Singleton1 {
    private static final Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){

    }
    public static Singleton1 getInstance(){
        return INSTANCE;
    }
}
