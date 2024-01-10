package chapter02_基础语法_变量及数据类型;

public class java_datatype_Reference {
    public static void main(String[] args){

        //todo 引用数据类型
        // 引用数据类型就是可以被引用的数据类型 如 Strign

        //String s = "abc"; //引用数据类型 可以被调用
        //int i = 10; // 基本数据类型
        //变量如果是基本数据类型，在存储时不会有相应箭头（只有向量存储）就不能被引用;


        //todo 基本数据类型和String的转化
        // String可以和8种基本数据类型做运算.且运算只能是连接运算
        // 两个相连接前后至少有一个String 那么"+"表示连接; 如果前后两个都没有String,那么"+"就代表莆普通的加减乘除的加法;
        // 多个相连接只要有一个String就行; 运算顺序是核心
        // char byte short 相加必定是int类型!!! 在操作数栈中最小单位为32 默认都当做int
        // 例子(所谓连接)
        /*int number = 1001;
        String numberStr = "学号:";
        String connect = numberStr + number;
        System.out.println(connect); */

        //*  *
        //System.out.println('*'+" "+'*');

        //String str = 123 + "";//是表示这个是个字符串123,不是数字123;不是给123加个双引号 输出出来是没有双引号的 想输出双引号\"\"


    }
}
