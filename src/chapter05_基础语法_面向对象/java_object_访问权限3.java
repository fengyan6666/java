package chapter05_基础语法_面向对象;

public class java_object_访问权限3 {
    public static void main(String[] args){


        //todo 访问权限--单例模式
        // JVM 默认给类提供公共、无参的构造方法 (public)
        // 类的创建过程复杂；类的对象消耗资源 （创建越多，资源消耗越多）
        // 创建不了对象就跳过创建对象，直接用类名调用方法
        // 单例模式就是有些情况需要用到同一个对象的时候可以用，或者不想浪费大量资源的时候也可以用
        // 补充知识点：静态方法或者类里面只能是静态的，普通方法里可以有静态也可以有非静态


        //User1 user1 = User1.ceishi(); //创建变量用于存放, 后面直接使用类名调用,这个方法有返回值就是他的对象


    }


}
//class User1{
//    private static User1 user = null; //创建一个当前类权限的静态的变量,让他等于空 //因为下面方法是静态的不能直接调用这个变量,所以要加静态
//
//    private User1(){  // 在方法里调用这个方法, 权限只能在当前类使用
//
//    }
//
//    public static User1 ceishi(){ //用默认权限或者public公开权限用于外部调用类名  设置成静态的用于调用
//        if (user == null){ //如果对象等于空,就创建对象,不等于空就直接返回对象
//            user = new User1();
//        }
//        return user;
//    }
//
//
//}
