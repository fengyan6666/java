package chapter09_进阶语法_线程;

public class java_线程_线程安全问题 {
    public static void main(String[] args){
        //todo 线程安全问题
        // 所谓的线程安全问题，其实就是多个线程在并发执行时，修改了共享内存中共享对象的属性，导致的数冲突问
//        User7 user = new User7();//
//
//        Thread t1 = new Thread(() ->{
//            user.name="zhangsan";
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(user.name);
//        });
//
//        Thread t2 = new Thread(() ->{
//            user.name="lisi";
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(user.name);
//        });
//        t1.start();
//        t2.start();
//        System.out.println("main方法执行完毕");



    }
}
//class User7{
//        public String name;
//}
