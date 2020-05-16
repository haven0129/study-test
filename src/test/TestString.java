package test;

/**
 * @author tao.huang
 * @date 2020-05-07 14:49
 */
public class TestString {
    public static void main(String[] args) {
//        String str = "abc";
//        chanage(str);
//        System.out.println(str);
//        String str1 = "a" + "b";
//        String str2 = "ab";
//        System.out.println(str1 == str2);
        String str1 = "a";
        String str2 = "b";
        String str3 = "ab";
        String str4 = str1 + str2;
        String str5 = str1 + str2;
        System.out.println(str4 == str5);
    }
    public static void chanage(String str){
        str = "xxx";
    }
}
