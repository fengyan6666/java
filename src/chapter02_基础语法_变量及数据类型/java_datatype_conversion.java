package chapter02_基础语法_变量及数据类型;

public class java_datatype_conversion {
    public  static void main(String[] args){

        // todo 数据类型的转化

        //String name = "zhangsan";
        //int age = "30";

        // todo 如何转化?
        // byte -> short -> int -> long -> float -> double
        // 范围从小到大 java范围小的数据可以转化为范围大的数据,范围大的数据不能"直接"转化为小的;
        //todo 下面是正确例子
        //byte b = 10;
        //short s = b;
        //int i = s;              //相当于e中的到文本到整数到数值
       //long l = i;             //不过这无法用一行表示,得两行
        //float f = l;
        //double d = f;
        //todo 下面是错误例子
         //int i = 10;
         //byte b = i;

       // System.out.println(d);

        //todo 如果想将范围大的数据转化为范围小的数据,需要使用小括号进行强制转化
        // 但是 强制转化会丢失很多东西,比如把大箱子里的东西放在小箱子里,那多余的东西肯定是要丢掉的(精度损失)
        // 下面是例子
//        double d = 10.05;
//        int i = (int)d;
//         System.out.println(i);//输出结果为10,小数点后面损失掉了








    }
}
