package chapter05_基础语法_面向对象;

public class java_方法重载练习_理解3 {

    public static void main(String[] args) {

        //todo 面向对象--方法重载练习2--"多态运用"
        // 多态其实就是限制的对象的使用场景
        // 方法的重载:方法名相同,参数列表不同(个数,顺序,类型)
            // AAA-->object
            // BBB-->AAA-->object
            // 找不到就找他的父类
//        AAA aaa =new AAA();
//        BBB bbb =new BBB();
//        AAA aaa = new BBB();
//        tese(aaa);



    }
}
//
//    static void tese(AAA aaa) {
//        System.out.println("aaa");
//    }
//    static void tese(BBB bbb) {
//        System.out.println("bbb");
//    }
//}
//
//
//class AAA{
//
//}
//class BBB extends AAA {
//
//}