package chapter09_进阶语法_线程;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class java_线程_线程池 {
    public static void main(String[] args){
        //todo 线程池
        // 所谓得线程池，其实就是线程对象得容器
        // 可以根据需要，在启动时，创建一个或者多个线程对象
        // java中有4种比较常见的线程池
        // 1.创建固定数量的线程对象
        // ExecutorService是线程服务对象


        //ExecutorService executorService = Executors.newFixedThreadPool(3);

//        for (int i = 0;i<5;i++){
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            });
//        }

        //todo 2.根据需求动态创建线程 // 同时运行了
//        ExecutorService executorService=Executors.newCachedThreadPool();
//        for (int i = 0;i<5;i++){
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            });
//        }


        //todo 3.单一线程
//        ExecutorService executorService=Executors.newSingleThreadExecutor();
//        for (int i = 0;i<5;i++){
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            });
//        }

        //todo 4.定时调度线程(可以分什么时候运行什么线程)这边没有详细讲
//        ExecutorService executorService=Executors.newScheduledThreadPool(3);
//        for (int i = 0;i<5;i++){
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            });
//        }
    }

}
