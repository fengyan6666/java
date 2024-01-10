package chapter08_进阶语法_集合;

import java.util.LinkedList;

public class java_集合_Collection_List的常用方法 {
    public static void main(String[] args){
        //构造对象
        LinkedList list =  new LinkedList();
        //追加数据
        list.add("zhangsan");
        list.add("lisi");
        list.add("zhaoliu");

        //想指定的位置增加数握
        list.add(1,"wamgwu");
        list.addFirst("1");
        list.addLast("2");
        //System.out.println(list);
        LinkedList list1 = new LinkedList();
        list1.add("zhangsan1");
        list1.add("lisi2");
        list1.add("zhaoliu3");
        list.addAll(list1);//把别的集合添加进来,是添加在当前数据的最后面
        System.out.println(list);


        list.remove(1);//有参数的remove 是删除指定位置的数据
        list.remove();//无参数的remove 是删除第一个数据
        list.removeFirst();//删除第一个数据
        list.removeLast();//删除z最后一个数据
        list.remove(2);//删除指定数据
        list.element();//获取第一个数据
        list.push("add");//添加数据//等同于set
        list.pop();//弹出数据//等同于删除数据//返回的是弹出的数据

        //这些的作用都和ArrayList的用法一样,看ArrayList常用方法即可
        list.size();
        list.contains("1");
        list.isEmpty();
        list.indexOf("");
        list.lastIndexOf("");

    }
}
