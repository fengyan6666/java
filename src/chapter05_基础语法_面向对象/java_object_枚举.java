package chapter05_基础语法_面向对象;

import java.sql.SQLOutput;

public class java_object_枚举 {
    public static void main(String[] args){

        //todo 面向对象---枚举(enum)
        // 除了类和接口以外的一个特殊类，包含一组特定对象，这些对象不会发生改变，一般使用大写标识符!!!
        // 枚举会将对象放置在最前面，那么和后面的语法需要使用分号隔开
        // 枚举类不能创建对象，其对象在内部自行创建

//          //简单例子
//        System.out.println(City.BEIJING);//直接打印变量,不用创建对象
//        System.out.println(City.SHANGHAI);

        //基础例子
//        System.out.println(City.BEIJING.name);
//        System.out.println(City.SHANGHAI.code);

        //进阶例子 和基础例子大同小异 基础例子更加便捷
//        System.out.println(MyCity.BEIJING.name);
//        System.out.println(MyCity.BEIJING.code);


    }
}
//简单例子
//enum City{
//    BEIJING, SHANGHAI
//}

//基础例子
//enum City{
//    //下面方法有了参数,所以上面这些对象也要添加参数
//    BEIJING("北京",10001), SHANGHAI("上海",10002);
//    City (String name, int code){
//        this.code=code;
//        this.name=name;
//
//    }
//    public String name;
//    public int code;
//}

//进阶例子
//class MyCity{
//    //下面方法有了参数,所以上面这些对象也要添加参数
//    public String name;
//    public int code;
//
//     private MyCity (String name, int code){
//        this.code=code;
//        this.name=name;
//
//    }
//    public static final MyCity BEIJING = new MyCity("北京",10001);
//    public static final MyCity SHANGHAI = new MyCity("上海",10002);
//
//}
