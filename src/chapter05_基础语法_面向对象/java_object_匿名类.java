package chapter05_基础语法_面向对象;

public class java_object_匿名类 {
    public static void main(String[] args){

        //todo 面向对象--匿名类  常用!!! //不是很理解,后面在往回看看
        // 直观点说就是没有名字的类，填充即可
        //	在某些场合下，类的名字不重要,我们只想使用类中的方法或功能,这时候我们可以采用匿名类
        // 接口抽象类匿名类结合使用例子
        //




//        Me me = new Me();
//        me.sethello(new Renming() {
//            public String name() {
//                return "wangwu";
//            }
//        });


        //todo 接口抽象类匿名类结合使用!!!
        // 实例感觉是创建一个类和方法,里面不写逻辑代码,但是在主程序里创建变量,然后在主程序里补充逻辑代码
//        new Fly1().fly();
//         new Fly(){ //创建对象重写方法
//             public void fly(){
//                 System.out.println("使用飞行器飞翔"); // 方法内具体逻辑代码
//             }
//         }.fly();//重点在这,后面要重新调用方法,就是调用上面重写的方法

    }
}
//基础例子
//abstract class Renming{
//    public abstract String name();
//}
//class Me {
//    public void sethello(Renming renming){
//        System.out.println("hello"+renming.name() );
//    }
//}




//接口抽象类匿名类结合使用
//interface Fly{ //定义一个接口一个方法
//    public void fly();
//}
//
