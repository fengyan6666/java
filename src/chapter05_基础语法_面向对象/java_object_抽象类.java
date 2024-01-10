package chapter05_基础语法_面向对象;

public class java_object_抽象类 {
    public static void main(String[] args){

        //todo 面向对象--抽象类--Abstract--基本概念
        // 对象是具体的，类是抽象的
        // 编写代码要从抽象到具体
        // 一个类不能准确的定义或者不完整,如果一个方法不能准确的描述功能 这些都叫抽象类
        // 没有抽象属性
        // 语法结构 abstract class
        // 类名，类不完整，无法直接构造对象，但可以通过子类间接构建!!!
        // 像是接口和类的结合,用来一定一个完整的规划流程,避免使用继承,使用继承父类的的程序越多越不好,每一次调用继承的子类都要创建大量对象
        // 创建大量对象的后果就是压栈过多,弹栈来不及,导致栈过多 报错

        //todo 面向对象--抽象方法--Abstract
        // 抽象方法:只有声明没有实现的方法叫做抽象方法  一般不加{}的就是抽象方法
        // 语法结构 abstract 返回值类型 方法名
        // 	如果一个类含有抽象方法，那么这个类是抽象类，子类继承时需要重写抽象方法，将方法补充完整！！！
        // 如果一个类是抽象类，那么它的方法不一定是抽象方法！！！
        // abstract 不能和 final 同时使用


        //AAA aaa = new AAA(); //抽象类无法创建对象
//        BBB bbb = new BBB();
//        bbb.est();
    }
}
//abstract class AAA{
////  public final abstract void eat(); // abstract 不能和 final 同时使用 会报错
//
//    public void test(){
//
//    }
//
//
//}
//class BBB extends AAA{
//    public void est(){
//        System.out.println("中国人只用筷子");
//    }
//}