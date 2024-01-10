package chapter08_进阶语法_集合;

import java.util.concurrent.ArrayBlockingQueue;

public class java_集合_Queue {
    public static void main(String[] args) throws Exception{
        //todo Queue
        // ArrayBlockingQueue= Array（数组） + blocking(堵塞：堵住)+Queue（q接口）
        // queue该有的方法都有,清空,创新集合等等
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);//需要写容量
        //add方法容量满了后再增加会报错 理解为看病挂号,挂满了后就不能挂上了
//        queue.add("zhanggsan");
//        queue.add("lisi");
//        queue.add("wangwu");
//        queue.add("zhaoliu");
//        System.out.println(queue);

        //put方法会堵住等待他空, 理解为挂号挂满了还能一直挂,但是只能能前面的看病好了位置空出来了才能挂上号
//        queue.put("zhangsan");
//        System.out.println("第一个人挂号");
//        queue.put("wangwu");
//        System.out.println("第二个人挂号");
//        queue.put("zhaoliu");
//        System.out.println("第三个人挂号");
//        queue.put("lisi");
//        System.out.println("第四个人挂号");
//        System.out.println(queue);

            //offer方法返回的不一样,返回的是逻辑型,如果加入成功返回真,加入失败返回假 也不会出现错误
//          boolean zhangsan = queue.offer("zhangsan");
//        System.out.println(zhangsan);
//          boolean lisi = queue.offer("lisi");
//        System.out.println(lisi);
//          boolean wangwu = queue.offer("wangwu");
//        System.out.println(wangwu);
//          boolean zhaoliu = queue.offer("zhaoliu");
//        System.out.println(zhaoliu);
//        System.out.println(queue);


//        System.out.println(queue.poll());//取出第一个数据
//        System.out.println(queue.poll());//取出第一个数据
//        System.out.println(queue.poll());//取出第一个数据
//        System.out.println(queue.poll());//取出第一个数据//没有数据取出就返回null


    }
}
