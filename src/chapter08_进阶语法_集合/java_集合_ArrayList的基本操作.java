package chapter08_进阶语法_集合;

import java.util.ArrayList;

public class java_集合_ArrayList的基本操作 {
    public static void main(String[] args){

        //TODO-Collection List
        //              ArrayList Array List

        //todo List:列表。清弹
        // 照数躬插入顺序进行存储

        //Todo Array:数组，阵列

        //todo 创建第一个集合对象：ArrayList
         ArrayList list = new ArrayList();//快捷导入包,alt+回车,在括号前面使用
        // 1.不需要传速向造参数，直接new就可以，底层数组为空数组
        // 2.均造参数需要传递一个int类型的值，用于设定底层数组的长度
        // 3.构造参数需要传递个Collection集合类型的值，用于将其他集合中的数据放置在当前集合中

        //todo 增加数据]
        // add(加)方法可以增加数据，只要将数据作为参数传递到add方法即可
        // 添m数据时，如果集合中没有任何的数据，那么底层会创建长度10的数组
        // 如果加入数据数量超过默认的数组长度,会创建一个“新的”数组,称之为扩容,用索引继承旧数组
//        list.add("zhangsan");
//        list.add("zhangsan");
//        list.add("zhangsan");
//        list.add("zhangsan");
        //todo 访问集合中的数据
        // 获取集合中数据的条数
        System.out.println(list.size());
        // 获取指定位置的数据,采用索引的方法
//        System.out.println(list.get(1));
        // 遍历方法,遍历所有数据,用循环遍历
        //todo 如果循环遍历集合数据时，不关心数据的位置，么可可以采用特殊的for新环
        // for（循环对象：集合）
//        for(Object obj:list){
//            System.out.println(obj);
//        }

        //todo 修攻数据
        // 将指定位置的数据进行修改。set方法需要传递2个参数，第一个参数表示数据的位置，第二个参数修改的值。
        // 方法会返回结果，这个结果就是更新前的值
//        Object oldVal=list.set(0,"lisi");
//        System.out.println(list);
//        System.out.println("修改前的值："+oldVal);

        //todo 删除数据
        // 将指定位置的数据进行删除，remove方法需要传递1个参数，参数表示数据的位置。
        // 方法会返回结果，这个结果就是删除前的的值
//        Object removeVal =  list.remove(1);
//        System.out.println("删除的值："+removeVal);










        //todo 打印集合对象
//        System.out.println(list);
//        System.out.println("main方法执行完毕");














    }
}
