package chapter06_基础语法_常用类;

public class java_object类 {
    public static void main(String[] args){

        //todo 常见类和对象
        // java.lang.object : 对象
        // 将对象转换成字符串，toString() 默认打印对象的内存地址，因此，为了能更直观地理解对象内容，可以重写这个方法
        // hashCode() 获取对象的内存地址
        // equals() 方法比较对象，默认比较内存地址
        // getClass() 获取对象的类型信息

       /* Object object = new Person();
        String s = object.toString();
        System.out.println(s);
        int i = object.hashCode();
        System.out.println(i);
        System.out.println(object.getClass());*/
    }
}
/*
class Person{
    public String name = "zhangsan";
    public String toString(){
        return "Person["+name+"]";
    }

}
class User extends Person{

}*/
