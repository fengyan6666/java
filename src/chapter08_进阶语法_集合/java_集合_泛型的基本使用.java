package chapter08_进阶语法_集合;

public class java_集合_泛型的基本使用 {
    public static void main(String[] args){

        //todo 泛型和类型的区别
        // 用于约束外部对象的使用场景，就是类型（outer）
        // 用于约束内部对象的使用场景，就是泛型（inner）
        // 有时也把泛型称之为类型参数
        // 类型存在多态使用
        // 泛型没有

//        MyContainer<uesr02> myContainer = new MyContainer<>();
//
//        test(myContainer);//虽然object是所有类的子类,但是这里还是不能使用,   可以说是环境的问题,泛型没有多态使用
//        // 举个例子, 有人让你买水果,你拿了个塑料袋装,一到菜市场买的水果是榴莲,榴莲算水果吗,算,塑料袋能装吗,不能；
//        // 这就是一个环境的问题了
//    }
//    public static void test(MyContainer<Object> myContainer){
//
//    }
}


//class MyContainer<C>{//约束数据的类型,尽量表达清除需要的类型
//    public C data;//强制使用c类型,否则报错
//
//}
//
//class uesr02{
//
}