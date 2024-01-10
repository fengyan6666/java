package chapter05_基础语法_面向对象;

public class java_object_方法重写_重点 {
    public static void main(String[] args){

        //todo 面向对象--方法重写
        // 重写是同名同参数,重载是同名不同参数
        // 方法的重写:父类对象的方法其实主要体现在通用性,无法在特殊的场合下使用
        //           如果子类对象需要在特殊的场合下使用,那么就需要重写方法和逻辑,这个操作在java中称之为方法的重写
        // 这里的重写,不是意味着父类的方法被覆盖掉,只是在当前场合不使用.如果使用super关键字还是可以访问.
        // 方法的重写要求,子类的方法和父类的方法,需要方法名相同,参数列表相同,返回值类型相同
//        zilei z = new zilei();
//        z.text();





    }
}
//class renlei{
//    String name = "zhangsan";
//
//    void test(){
//        System.out.println("fulei...");
//    }
//
//}
//class zilei extends renlei{
//    String name = "lisi";
//
//    void text(){
//        super.test();//想要调用fulei的相同名字的方法,可以在外围调用子类,在子类里依靠super来调用父类 实现父类方法调用
////        System.out.println(this.name);
////        System.out.println(super.name) ;
//    }
//}