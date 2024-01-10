package chapter05_基础语法_面向对象;

public class java_object_访问权限2 {
    public static void main(String[] args){

        //todo 访问权限(内部类和外部类)
        // 外部类：在源码中直接声明的类  (java不允许外部类使用private语句修饰)(外部类只能用public权限和默认权限)
        // 内部类：类中直接声明的类（外部类的属性），需要构建外部类对象才可使用
        //        内部类就当做外部类的属性使用,需要构造外部类属性才可以使用 加了静态就叫静态内部类
//        AAA aaa = new AAA(); // 创建对象
//        AAA.BBB aaabbb = aaa.new BBB();// 这样相当于调用内部类 创建类里面的类的对象赋予给aaabbb;

    }

}
//class AAA{
//    class BBB {//内部类 类里面的类就做内部类 这行就当做内部类
//    }
//
//}