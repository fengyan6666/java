package chapter05_基础语法_面向对象;

public class java_object_递归_小重点 {
    public static void main(String[] args){

        //todo 面向对象--"递归"
        // 方法的递归:方法调用自身,称之为递归方法
        // 为什么调用自己,因为逻辑相同 //例如 1+3+5+7....+19.. 等差  递归的典型例子是数字的阶乘 3!
        // 方法调用自身（阶乘等）
        // 方法要有跳出的逻辑，注意 StackOverflowError (数值过大 压栈)
        // 调用自身时，传递的参数要有规律

//        int aaa = jiecheng(500000);//如果数值过大 又没有跳出 会压栈 报错
//        System.out.println(aaa);




    }

//    public static int digui(int num){
//        //三元运算符 基本语法结构: 变量 = (条件表达式) ? (任意表达式1):(任意表达式2)
//        num = num%2==0 ? num-1:num; //如果能被整除(偶数)就减1后再用num运算  如果不能被整除(奇数)就直接运算
//
//        if(num==0){ // 如果num是1的话就直接返回1
//            return 1;
//        } else {
//            return num+digui(num-2);
//        }

        // 最后就是初始是10,因为是偶数所以减1变9 然后按照逻辑循环走 每次循环num都会减2 知道num=1 9+7+5+3+1

    }

//    public static int jiecheng(int num1){
//
//        if( num1>5000){
//            System.out.println("数值过大");
//            return 0;
//        }
//        if (num1<=1){
//            return 1;
//
//        }else {
//            return num1*jiecheng(num1-1);
//        }
//
//
//    }
//}
