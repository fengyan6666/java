package chapter05_基础语法_面向对象;

public class java_object_继承3 {
    public static void main(String[] args){

        //todo 面向对象--继承、构造方法
        // 父类对象在子类对象创建前创建完成，创建子类对象前，会调用父类构造方法完成父类属性初始化
        // 默认情况下，子类对象构建时，会默认调用父类的构造方法完成父类属性的构建，使用的是 super，只不过由 JVM 自动完成（无参）
        // 如果父类提供构造方法，那么 JVM 不会提供默认的构造方法，那么子类应该显式调用 super 方法构建父类对象 (要给参数才能创建父类)
        // new 只会构建一个对象，在内存中只会开辟一块空间存储创建的对象 （储存父类的成员属性和方法） 先开辟了内存空间后构造方法

//        zilei c1 = new zilei();
//        zilei c2 = new zilei();
//        zilei c3 = new zilei();






    }
}

//class fulei{
//    String username;
//    fulei(String name){
//        username = name;
//        System.out.println("fulei...");
//    }
//
//}
//
//class zilei extends fulei{
//
//    zilei(){
//        super("zhangsan");
//        System.out.println("zilei...");
//    }
//
//
//}
//
