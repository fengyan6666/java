package chapter10_进阶语法_反射;

public class java_反射_类加载器 {
    public static void main(String[] args){

        //todo 反射--类加载器
        // 加载类
        // java中类分3中
        // 1.java核心类库中的类;String Object...中的类
        // 2.JVM 软件开发商
        // 3.自己写的类
        // 类加截器也3种
        // 1.BootClassLoader : 启动类加载器(加载类时,采用操作系统平台语言实现)
        // 2.PlatformclassLoader : 平台类加载器
        // 3.AppClassLoader : 应用加载器
        // 加载 java核心类库 > 平台类库 > 自己类      (上下级)

//        //TODO 获取关的后息
//        Class<Student>studentClass =  Student.class;
//        //获取类的加载器对象
//        ClassLoader classLoader =  studentClass.getClassLoader();
//        System.out.println(classLoader);
//        System.out.println(classLoader.getParent());//返回当前这个类的上一级类
//
//
//        Class<String>stringclass =  String.class;
//        //获取类的加载器对象 启动类加载器(加载类时,采用操作系统平台语言实现)
//        ClassLoader classLoader1 =  stringclass.getClassLoader();
//        System.out.println(classLoader1);
//
//

    }
}
//class Student {
//
//}