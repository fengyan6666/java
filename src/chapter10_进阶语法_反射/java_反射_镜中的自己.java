package chapter10_进阶语法_反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class java_反射_镜中的自己 {
    public static void main(String[] args) throws Exception{


        //todo 反射

        User user = new Child();
        user.test1();
        //user.test2();//获取不到

        //类对象
        Class<?extends User>aclass = user.getClass();

        //todo 获收类的名称
        System.out.println(aclass.getName());//获取包名加类的名称 完整名称
        System.out.println(aclass.getSimpleName());//获取类的名称 只有类的名称
        System.out.println(aclass.getPackageName());//获取类的包的名称

        //todo 获取类的父类
        Class<?>superclass =  aclass.getSuperclass();

        //todo 获取类的按口
        Class<?>[]interfaces = aclass.getInterfaces();//返回的是数组
        System.out.println(interfaces.length);//没接口,应该返回的是0 ,返回的是数组长度


        //todo 获收类的属性
        Field f = aclass.getField("xxxxx");//只能获取公开权限的属性
        Field f1 = aclass.getDeclaredField("xxxxx");//所有权限的属性都能取到
        Field[]fields =  aclass.getFields();//获取全部公开的属性
        Field[]declaredFields =  aclass.getDeclaredFields();//获取全部属性

        //todo 获取类的方法
        Method method = aclass.getMethod("test2");//public的方法
        Method xxxx=aclass.getDeclaredMethod("xxxx");//所有权限的方法

        Method[]methods =  aclass.getMethods();//获取全部公开的方法
        Method[]declaredMethods= aclass.getDeclaredMethods();//获取全部方法

        //todo 构造方法对象
        Constructor<? extends User> constructor = aclass.getConstructor();
        Constructor<?>[] constructors = aclass.getConstructors();//也可以返回数组
        aclass.getDeclaredConstructor();//所有权限

        //todo 获取权限(修饰符).多个修饰符会融合成一个int值
        int modifiers = aclass.getModifiers();//返回值是数字
        Modifier.isAbstract(modifiers);//modifier.is  出来会有很多判断是否是什么权限的,返回结果是逻辑型

    }
}

class User{
    public void test1(){
        System.out.println("test1..");
    }

}
class Child extends User{

    public void test2(){
        System.out.println("test2..");
    }
}