package chapter05_基础语法_面向对象;

public class java_object_多态_重点 {
    public static void main(String[] args){

        //todo 面向对象---“多态”
        // 一个对象在不同场景下表现出来的不同状态和形态
        // 多态语法其实就是对对象的使用场景进行了约束
        // 一个对象可以使用的功能取决取引用变量的类型
        // 以父类声明的子类对象，只能只用父类中的方法（这是一种约束）
        // 想要使用子类中的方法 就得创建子类对象 从而不靠父类对象
        // 对象的多态性：父类的引用指向子类的对象（或者说子类的对象赋给父类的引用）、
        // 多态的使用：当调用子父类同名同参数时。实际执行的是子类重写父类的方法---虚拟方法调用
        // 多态的使用八成在接口 两成在抽象类
        // 对象的多态性，只适用于方法，不适用于属性
        // 实例来看的话,感觉是细分父类的意思,从广泛到精细的调用


//        renlei c = new renlei();
//        c.testrenlei();
//        renlei c1 = new boy();
//        c1.testrenlei();
//        boy b = new boy();
//        b.testboy();
//        renlei c2 = new girl();
//        c2.testrenlei();
//        girl g = new girl();
//        g.testgirl();
//






    }
}
//class renlei{
//
//    void testrenlei(){
//        System.out.println("test renlei...");
//
//    }
//
//}
//
//class boy extends renlei{
//     void testboy(){
//         System.out.println("test boy...");
//
//     }
//
//}
//class girl extends  renlei{
//    void testgirl(){
//        System.out.println("test girl...");
//
//    }
//
//
//}