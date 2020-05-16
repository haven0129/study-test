package reflect;

/**
 * @author tao.huang
 * @date 2020-05-15 16:40
 * java反射
 */
public class ReflectTest1 {
    /**
     * Class.forName("全类名");	// 将字节码文件加载进内存，返回class对象
     * 类名.class;	// 通过类名的属性class来获取
     * 对象.getClass();	// getClass()方法在Object类中定义了
     * @param args
     */
    public static void main(String[] args) throws Exception{
        // 1、Class.forName("全类名");
        Class cls1 = Class.forName("reflect.Person");
        System.out.println(cls1);
        // 2、类名.Class;
        Class cls2 = Person.class;
        System.out.println(cls2);
        // 3、对象.getClass();
        Class cls3 = Person.class;
        System.out.println(cls3);

        System.out.println(cls1 == cls2 &&  cls2 == cls3);
    }
}

