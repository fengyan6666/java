package chapter05_基础语法_面向对象;

public class java_object_静态代码块 {
    public static void main(String[] args){

        //todo 静态代码块
        // 先有类，再有对象
        // 有成员方法的时候，静态方法（类）一定存在，
        // 因此 可在成员方法内部调用静态方法/属性，但静态方法不能访问成员方法/属性
        // static { xxx } 类的信息加载完成后，会自动调用静态代码块，可以完成静态属性的初始化（按照声明静态代码块顺序依次执行）
        // 对象准备创建时（对象创建前），也会自动调用代码块 {xxx}，但不是静态的


//
//        Test t = new Test();
//        t.test();
//       Test.test1();
        //new Test();
        //Test.test();

    }

}
//class Test {
//    static {
//        System.out.println("静态代码块1");
//    }
//    static {
//        System.out.println("静态代码块2");
//    }
//    static void test(){
//        System.out.println("静态方法");
//    }
//    {
//        System.out.println("代码块执行");
//    }
//    static {
//        System.out.println("静态代码块2");
//    }
//    {
//        System.out.println("代码块执行");
//    }
//
//
//
//
//
//
//
//}




















//class Test {
//    String name;
//    static String sex;
//    void test(){
//        test1();
//
////      System.out.println("test...");
//    }
//
//    static void test1(){
//        System.out.println("test1...");
//    }
//
//
//}
