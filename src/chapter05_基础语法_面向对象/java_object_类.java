package chapter05_基础语法_面向对象;

public class java_object_类 {
    public static void main(String[] args){

        //todo 面向对象(分析问题时,以问题所涉及到的事或物为中心的分析方式)
        // 类和对象
        // 类:表示归纳和整理
        // 对象:表示具体的事物
        // 特殊对象:空对象 语法结构 ask aw1 =null; 所有引用数据类型的默认值都是null

        //todo class(类) //类名的第一个字母要大写(是一种规范)
        // 基本语法结构:
        // class 类名{
        //    (特征)属性；
//            (功能)方法；
//            void 方法名(){
//                      }
//            }


        //todo 1.先声明类  声明的语法: class 类名{}
        // 例子
//        class Cooking{
//        }

        //todo 2.创建对象  创建对象的语法: new 类名();
        // 例子
//        new Cooking();

        //todo 3.声明属性 (属性="类"(class)中的变量)
        // 变量类型 变量名称=变量值
        // 属性类型 属性名称=变量值
        // 例子
//        Cooking c =new Cooking();
//       c.name = "红烧排骨";
//       c.food = "排骨";

        //todo 4.声明方法  语法结构 void 方法名(参数){功能代码}

        //todo 5.执行方法  语法结构 对象.方法名()  方法名和变量一样 是自己取的名字


        //todo 总结 写class相当于写一个子程序 子程序内是写好的逻辑代码 对象.方法名()是调用子程序 创建对象是调用子程序的前提,
        // 相当于告诉计算机我要开始使用了
        // 按照运行顺序 创建和调用必须在class(子程序)的下面才能使用 等于上面的class是要运行的东西,下面按照自己的想法顺序依次调用
        // 子程序里的逻辑代码需要定义好变量和想运行的程序代码
        // new 类名()，使用一次，创建一次，每次都是新的


        //todo 栈和堆
        // 栈(储存局部变量) 特点:先进后出  (方法中的变量都是局部变量,跟e一样,子程序局部变量) (栈会清空数据)
        // 堆(栈里的属性存在堆里面)(堆不会清空数据)



        //todo 属性(类的对象的相同特征)
        // 语法和变量的声明很像
        // 属性类型 属性名称 = 属性值
        // 如果在声明属性的同时进行初始化赋值,那么所有对象的属性就完全相同
        // 如果希望每个对象的属性不一样,那可以不在声明的时候给他进行初始化(赋值)
        // 那样属性就会默认初始化,默认初始化的值取决于属性的类型



        //todo 方法(对象的行为和功能)
        // 方法名自定义 要遵循标识符的使用
        // void 代表着空 意味着这个子程序是没有返回东西的 如果运行的结果有返回值 开头的void就不能使用了
        // 根据返回值的类型来更改 比如 返回的是布尔类型 真或假 那void就该改为boolean
        // 结果还需要配合代码   return; 例如return ture; 就是返回了个真    和e中子程序 返回() 相同


//        //试例
//        class Cooking{
//            boolean zhuce(){
////                System.out.println("注册成功");
//                return true;
//
//
//            }
//            boolean denglu(){
////                System.out.println("登录成功");
//                return false;
//
//            }
//
//        }
//        Cooking c =new Cooking();
//        boolean ures = c.zhuce();
//        if( ures){                          //这边的if判断是自主判断的 不用像e里面给他写 = 真
//            System.out.println("注册成功");
//            boolean isns = c.denglu();
//            if(isns){
//                System.out.println("登录成功");
//
//            }else{
//                System.out.println("登录失败");
//            }
//
//        }























    }
}
