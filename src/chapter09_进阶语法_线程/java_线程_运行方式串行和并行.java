package chapter09_进阶语法_线程;

public class java_线程_运行方式串行和并行 {
    public static void main(String[] args) throws Exception{//抛出异常
//        //todo 线程-执行方式（串行，并发）
//        // 串行执行：多个线程连按成串，然后按照顺序执行
//        // 并发执行：多个线程是独立，谁抢到了CPU得执行权，谁就能执行
//
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
//        System.out.println("main方法执行完毕");
//
//        //将线程连接起来成串
//        t1.join();
//        t2.join();

    }
}

//class MyThread1 extends Thread{
//
//    public void run() {
//        System.out.println("我的线程"+Thread.currentThread().getName());
//    }
//}
//
//class MyThread2 extends Thread{
//
//    public void run() {
//        System.out.println("我的线程"+Thread.currentThread().getName());
//    }
//}