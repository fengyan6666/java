package chapter05_基础语法_面向对象;

public class java_object_访问权限 {//加了public当前公共类名字要和源码名相同,不加就没事
    public static void main(String[] args){//如果这里不加public 不给权限 就不能运行 不加static也不能运行 不加就是个成员方法!!

        //todo 面向对象--"访问权限"
        // 了解以后写代码尽量加入权限
        //todo java中的访问权限主要分为4种;
        // 访问权限范围从大到小: public-->(default)-->protected-->private
        // 1.public方法:公共的访问权限修饰符(任意使用，对于一个 Java 文件，公共类只能有一个，而且必须和源码文件名相同!!!)
        //           加public代表当前这个类在任何地方都能用
        //           mian方法:由 "JVM" 调用的（允许任意调用,不用考虑权限问题）(公共方法)
        //           static方法:静态语法,跟当前类有关系,



        //todo 2.private(私有的):同一个类中可以使用
        // 实例:
//        AAA aaa = new AAA();
//        System.out.println(aaa.name); //这里调用就会爆红,完全获取不到这个变量
//        System.out.println(aaa.username); //这里用来public(公共权限)调用就不会爆红


        //todo 3.(default)：包权限(路径权限)，当不设定任何权限时，JVM 会默认提供
        // 什么都不用加,这是默认的
        // 变量在同一个包内,可以正常互相调用;
        // 变量不在一个包内,需要导入包,还需要给加public,需要给权限

        //todo 4.protected:受保护的权限，子类可以访问
        // 相当于父类中的子类才可以调用
        // 好像没啥用,子类原本就可以调用父类的成员属性和方法

        //todo 访问权限
        //private:同类
        //default:同类,同包(路径)
        //protected:同类,同包(路径),子类
        //public:公共的
        //所谓方法权限,其实就是访问属性,方法的权利和性质






    }

}

//class AAA{
//    private String name;          // private例子 加了只能在当前类中使用
//    public String username;       // public例子
//    String sex;                   // default例子
//    protected int age;            // protected例子
//
//    void tet(){
//        System.out.println(name); // 这里使用是正常的
//    }
//
//}
//
//class BBB extends AAA{
//    void tet1(){
//        System.out.println(age);  //加了protected后子类可以直接使用父类变量
//
//    }
//
//}