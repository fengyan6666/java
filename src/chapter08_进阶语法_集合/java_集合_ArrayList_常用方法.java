package chapter08_进阶语法_集合;

import java.util.ArrayList;

public class java_集合_ArrayList_常用方法 {
    public static void main(String[] args){
        // TODO-Collection List
        //  ArrayList的常用方法
        ArrayList list = new ArrayList();
        list.add("asd");
        list.add("ass");
        list.add("asg");
        list.add("asx");
        //add方法可以传递2个参数的，第一个参数表示数据增加的位置（索引），第2个参数表示数据
        // 两个参数的add方法是插入数据
        list.add(1,"asd");

        // 还是追加数据的方法,不过这是集合类全部添加
        ArrayList otherList = new ArrayList();//这个是新的集合
        otherList.add("1");
        otherList.add("2");
        otherList.add("3");
        list.addAll(otherList );

        //size方法表示集合内部数据的数量
        System.out.println(list.size());
        //清空”全部“集合中的数据
        list.clear();
        //清空指定集合中的数烟
        list.removeAll(otherList);
        //判断集合中的数据是否为空（逻辑型返回值）
        System.out.println(list.isEmpty());
        //用于判断集合中是否存在某条数据：返回布尔类型的值
        list.contains("zhansan");
        System.out.println(list.contains("zhansan"));//(集合中是否包含)
        //用于获取数据在索引中的位置,就是获取索引的值,如果数据不存在,返回-1,有重复数据,就返回第一个数据的位置
        list.indexOf("zhangsan");//有重复数据,就返回第一个数据的位置
        list.lastIndexOf("zhangsan");//有重复数据,就返回最后一个个数据的位置
        System.out.println(list.indexOf("zhangsan"));
        System.out.println(list.lastIndexOf("zhangsan"));
        // 用于把集合转变成数组
        list.toArray();
        Object[]objects = list.toArray();
        // 用于创建一个新的集合 //复制新集合
        list.clone();//类型是一个通用的类型,需要转换成我们自己的类型
        Object clone = list.clone();
        ArrayList list1 = (ArrayList)clone;
        System.out.println(list1);//clone是复制,所以之前的集合数据还是有的


        System.out.println(list);

    }

}
