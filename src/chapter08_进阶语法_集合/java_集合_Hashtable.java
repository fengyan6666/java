package chapter08_进阶语法_集合;

import java.util.Hashtable;

public class java_集合_Hashtable {
    public static void main(String[] args){

        //todo Hashtable
        //Hashtable teblie = new Hashtable();
        //teblie.remove(); teblie.put(); teblie.get();//前面有的他都有


        // todo 1.实现方式不一样,继承父类不一样,功能也不一样；
        //  底层结构容量不一样,HashMap（16）,Hashtable（11）
        //  HashMap的k和v是可以为空的 , Hashtable的k和v不能为空（null）
        //  HashMap的数据定位采用的哈希算法, Hashtable采用的是Hashcode；
        //  只要提现在多线程的时候  HashMap的性能较高,Hashtable的性能较低,因为Hashtable要考虑并发时的问题和安全性,所以慢, HashMap不考虑


    }
}
