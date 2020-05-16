package designpattern;

/**
 * @author tao.huang
 * @date 2020-05-13 17:55
 * 单例模式:懒汉
 * 线程安全
 * 懒加载
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){

    }
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
