package chapter05_基础语法_面向对象;

public class java_object_构造方法 {
    public static void main(String[] args){
        //todo 面向对象--构造方法
        // 用于构建对象，在 new 对象的时候调用执行
        // 如果一个类中没有任何构造方法，JVM 会自动添加一个 公共的、无参的 构造方法，方便对象调用   如果有,就不会添加
        // 基本语法 类名 () { xxx }
        // 1.构造方法也是方法，但是没有 void 关键字
        // 2.方法和类名完全相同
        // 3.构造方法也可以传递参数，一般用于对象属性的赋值
        // 代码块 比构造方法先执行 !!!

//        System.out.println("**********");
//        User11 user = new User11("lisi");
//        user.test();
//        System.out.println(user.username);
//        System.out.println("**********");


        //todo 构造方法用在有需要在 创建时运行逻辑代码的时候






    }
}
//
//class User11{
//
//    String username;
//
//
//    {
//        System.out.println("代码块");
//    }
//    User11(String name){//构造的方法
//        username = name;
//
//        System.out.println("user");
//
//    }
//
//
//    void test(){
//        System.out.println("test...");
//
//    }
//    {
//        System.out.println("代码块");}
//
//
//}