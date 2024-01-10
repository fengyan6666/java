package chapter05_基础语法_面向对象;

public class java_object_final常量
{

    public static void main(String[] args){

        //todo 面向对象--final变量
        // 一般将final修饰的变量称之为常量,或者叫不可变变量
        // final关键字: 修饰变量，使变量值初始化后不被修改
        //             修饰属性，JVM 无法自动初始化，属性值不变（override）
        //             可以修饰类，这样的类没有子类(无法继承关系)
        //             能修饰构造方法
        //	           可以修饰方法参数，无法修改

        //例子1 修饰变量
//        User1 user = new User1();
//        System.out.println(user.name);
//        user.name="lisi";//加了final后会报错,因为此时的变量name已经是最终变量了不能改变
//        System.out.println(user.name);

        //例子2 修饰属性
//        User2 user2 = new User2("zhangsan");
//        System.out.println(user2.name);
//        System.out.println(user2.name);


    }
}


//class User1{
//     public final String name = "zhangsan"; //初始化 如果这里加了final 后面这个变量就无法改变
//
//}
//class User2{
//    public final String name ;
//
//    public User2(String name){
//        this.name = name;
//
//    }
//
//
//
//}
//例子3 修饰类
//final class User3{
//
//}
//
//class Uesr4 extends User3{ 父类加了final 所以这里会报错,不会有子类
//
//}