package chapter08_进阶语法_集合;

import java.util.ArrayList;
import java.util.Comparator;

public class java_集合_比较器 {
//    public static void main(String[] args){
//
//        ArrayList list = new ArrayList();
//        list.add(1);
//        list.add(3);
//        list.add(2);//现在输出的还是无序的
//
//        // 1,3,2-->3,1,2-->3,2,1 //两两比较互换位置,,像冒泡算法
//        // 3,2,1
//
//
//        // 排序需要传递一个实现比较器接口的对象
//        list.sort( new DigitalComparison());//所以这边里面的对象就是下面的方法，用于判断排列顺序
//
//        System.out.println(list);
//    }
}

//class DigitalComparison implements Comparator<Integer> {
//    @Override
//    public int compare(Integer o1, Integer o2) { //compare方法就是比较谁大谁小
//        //todo 如果我们的第一个数比第二个数大,返回正数,表示升序
//        return o1 - o2;
//        //todo 如果我们的第一个数比第二个数小,返回负数,表示降序
//        //return o2 - o1;
//        //todo 如果我们的第一个数和第二个数一样大,返回0,
//        //return 0;
//    }
//}
