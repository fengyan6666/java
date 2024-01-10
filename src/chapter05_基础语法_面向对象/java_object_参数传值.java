package chapter05_基础语法_面向对象;

public class java_object_参数传值 {
    public static void main(String[] args) {
        //todo 值传递 (c语言指针)难以理解
        // 关于变量的赋值 规则 如果变量是基本数据类型,那传递的是实际存储的值
        // 如果变量是引用数据类型,那传递的是变量的地址值

        //todo 方法的形参的传递机制:值传递
        // 形参:方法定义时,声明的小括号里的参数
        // 实参:方法调用时,实际传递给形参的值
        // 值传递:基本类型传数据值,引用类型传地址值


//        ABC abc =new ABC();
//        abc.name = "zhangsan";
//        ahs(abc);
//        System.out.println(abc.name);


//        ABC abc =new ABC();
//        abc.s1 = 10;
//        ahs(abc);
//        System.out.println(abc.s1);


    }


//    public static void ahs(ABC abc){
//        abc.name ="lisi";
//
//    }
//    public static void ahs(ABC abc){
//        abc.s1= 20;
//
//    }
//
}
//class ABC{
//    String name;
//    int s;
//    int s1;
//
//}