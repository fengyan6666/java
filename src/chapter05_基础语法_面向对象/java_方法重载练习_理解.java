package chapter05_基础语法_面向对象;

import javax.xml.namespace.QName;
import java.security.spec.RSAOtherPrimeInfo;

public class java_方法重载练习_理解 {
    public static void main(String[] args){

        //todo 面向对象--方法重载练习
        // 如果在一个构造方法中,想要调用其他的构造方法,需要特殊关键字 this







        //attt at = new attt(); // 用了构造方法,创建时会自动运行类里面的方法
//        attt at1 = new attt("zhangsan");
//        attt at2 = new attt("lisi","男");


    }
}

//class attt{
//    attt(){
//        this("zhangsan"); //用了this关键词 差不多就是在创建的时候给予变量赋值,可以不用类外面赋值
//
//
//}
//
//    attt(String name){
//        //this(name,"男"); // 一个方法里只能用一个this
//        this(30,"男"); //  this给根据你输入的东西去匹配类型 然后使用
//
//    }
//    attt(String name,String sex){
//        System.out.println(sex); //这边因为上面this赋值的是下面方法的sex 所以这边赋值是空,就不会输出东西出来 像套娃
//
//
//    }
//    attt(int c ,String sex){
//        System.out.println(c);
//
//    }
//
//}