package chapter08_进阶语法_集合;

import java.util.LinkedList;
public class java_集合_Collection_List的基本操作 {
    public static void main(String[] args){
        //构造集合对象
        LinkedList list =  new LinkedList();

        //构造第一个数据
        list.add("zhangsan");
        //构造第二个数据
        list.addFirst("lisi");//first代表着在最前面加入数据
        list.addLast("lisi");//last代表着在最后面加入数据
        //构造更多的数据   //这边本质是没有索引的,用的是链表的结构
        list.add(1,"wangwu");//这就需要用到索引的位置来构造

        //todo 获取数据
        System.out.println(list.getFirst());
        System.out.println(list.getLast());//两个都可以

        //todo 茯收数解（道历数据）
        //System.out.println(list.get(1));
        // 第一种
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //第二种
        for (Object obj:list ) {
            System.out.println(obj);//和Arraylist一样
    }

        //todo 修改数据
        list.set(1,"lisi");//依照索引修改数据

        //todo 删除数据
        list.remove("zhangsna");


        //todo 打印集合数据
        System.out.println(list);




    }




}

