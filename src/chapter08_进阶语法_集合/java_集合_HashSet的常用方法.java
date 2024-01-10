package chapter08_进阶语法_集合;

import java.util.ArrayList;
import java.util.HashSet;

public class java_集合_HashSet的常用方法 {
    public static void main(String[] args){
        HashSet set = new HashSet<>();
        ArrayList list = new ArrayList();
        list.add("zhangsan");
        list.add("Lisi");
        list.add("wangwu");
        set.addAll(list);//转换调用

        Object[]objects = set.toArray();//将集合转化成数组，这样就有了索引，但是没啥用
        System.out.println(set.isEmpty());
        set.clear();
        set.contains("zhangsan");
        System.out.println(set.size());
        Object clone = set.clone();//新集合
        System.out.println(clone);



    }
}
