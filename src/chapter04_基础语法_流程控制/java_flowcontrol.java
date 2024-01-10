package chapter04_基础语法_流程控制;

public class java_flowcontrol {
    public static void main(String[] args){
        //todo 流程控制(对指令执行顺序的控制)
        // 优先级
        // 流程顺序分三种: 顺序执行; 分支执行; 重复执行;
        //todo 1.顺序执行(代码出现的先后顺序以及语法的顺序)
        // 顺序执行例子
//        int i = 10;
//        int j = 20;
//        System.out.println(i+j);


        //todo 2.分支执行(根据判断决定是否执行)
        // 单分支 双分支 多分支 特殊多分支
        //todo 2.1.单分支(可选分支)(通过判断决定走不走分支)
        // 判断:条件表达式结果是否为ture,如果是,执行分支逻辑;如果不是,继续执行
        // 判断的语法用"if"关键字 表示如果,在条件表达式前使用
        // 例子
//        System.out.println("第一步");
//        System.out.println("第二步");
//        int i = 11;
//        if(i==10){
//            System.out.println("分支");
//        }
//        System.out.println("第三步");

        //todo 2.2 双分支(必选分支)(通过判断决定分支1还是分支2)(二选一) "else" 关键字
        // 判断:条件表达式结果是否为ture,如果是,执行分支1逻辑;如果不是,执行分支2逻辑
//        int i = 120;
//        if(i==10){
//            System.out.println("分支1");
//        }else{
//            System.out.println("分支2");
//        }


        //todo 2.3 多分支(多个判断)(可选分支) "else if" 新关键字 (多分支判断)
//        int i = 11;
//        if(i==10){
//            System.out.println("分支1");//if 如果
//        }else if(i==120) {
//            System.out.println("分支2");//else if 否则如果
//        }else{
//            System.out.println("分支3");//else 否则
//        }

        //todo 2.4 特殊多分支(判断表达式的具体)(可选分支) "Switch" "case" "break" 新关键字(与c语言相同) (等值分支判断)
        // switch语句会对数据进行判断,如果等于某一分支的数值,就会执行相应的逻辑代码
        // 如果想从"可选分支"变成"必选分支" "default" 新关键字 使用了default后,如果一个分支都没有匹配到,会默认执行dafault内的逻辑代码
        // brack 跳出当前循环(跳出整个循环) case 等值判断(相等才能判断出) continue 继续循环 (跳过当前循环,执行下次循环)
//        System.out.println("第一步");
//        System.out.println("第二步");
//        int i =10;
//        switch (i){
//            case 10:
//                System.out.println("分支1");
//                break;
//            case 20:
//                System.out.println("分支2");
//                break;
//            case 30:
//                System.out.println("分支3");
//                break;
//            default:
//                System.out.println("必选分支");
//                break;
//        }
//        System.out.println("第三步");


        //todo 多分支判断练习
//        int age = 30;
//        //儿童(0-6),少年(7-17),青年(18-40),中年(41-65),老年(66及以上).
//        if(age < 7){
//            System.out.println("儿童");
//        }else if(age >= 7 && age <18){
//            System.out.println("少年");
//        }else if(age >= 18 && age <41){
//            System.out.println("青年");
//        }else if(age >= 41 && age <66){
//            System.out.println("中年");
//        }else if(age >= 66){
//            System.out.println("老年");
//        }
            //更详细应该判断年龄是否为负数,年龄应该有上限




        //todo 3.重复执行(循环) 与c语言相同
        // java中 循环语句有三种
        // while:有条件循环
        // do while
        // for

        //todo 3.1 while(条件循环) 可以理解为e中判断循环首 条件表达式在前面 简称"先判断在循环"
        // 基本语句结构 while(条件表达式){需要循环的代码}
        // 例子
//        int age = 30;
//        while(age<40){
//            age = age+1; //这样可以自己选择循环计次 或者用age++; 原理相同
//            System.out.println("循环代码"); //无任何条件会死循环
//        }
//        System.out.println("结束");

        //todo 3.2 do while(条件循环) 可以理解为e中循环判断首 条件表达式在后面 简称"先循环在判断" 与while语句相比区别是至少循环了一次
        // 基本语句结构 do {循环代码} while(条件表达式)
        // 例子
//        int age = 30;
//        do{
//            age++;
//            System.out.println(age);
//        }while(age<40);
//        System.out.println("结束");


        //todo 3.3 for(条件循环)
        // 条件表达式结果为falss则跳过循环语句,直接执行后续代码;为ture则执行循环语句
        // 基本语句结构 for(初始化表达式;条件表达式;更新表达式){循环代码}
        // 初始化表达式用于对条件表达式中使用到的变量进行初始化  给变量赋值相当于变量的初始化
        // 条件表达式用来判断是否进入循环语句;还是简化版本
        // 更新表达式用来改变使用的变量的赋值;也可以当做跳出循环的关键
        // 例子
        //int age = 0;
//
//        for(int age = 0;;age<=10;age++){
//            System.out.println("这是第"+ age +"次循环");
//            //age++;
//        }
//        System.out.println("结束");












    }






}
