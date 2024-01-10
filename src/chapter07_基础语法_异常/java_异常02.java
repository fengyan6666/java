package chapter07_基础语法_异常;

public class java_异常02 {
    public static void main(String[] args){
        //todo 异常的语法处理
        // 语法结构
        /*
         try {  //try(尝试)
            这里放可能出现的异常的代码
            如果出现异常,jvm会将异常进行封装,形成一个具体的异常类,然后将这个异常抛出 （Throwable）
            所有的异常对象都可以被抛出
         } catch (这里放 抛出的对象 对象引用) { //catch（捕捉）
            这里放 异常的解决方案
         } catch() { //多个异常,按顺序捕捉,就需要多个catch,需要先捕捉范围小的异常,在捕捉范围大的异常
          只有一个异常的时候不需要多个catch

         } finally { //finally（最终）
         这里放 最终执行的代码逻辑
         }

         */
        // todo 语法使用例子
//        int i=0;
//        int j=0; //除数不能为 0 ；这里是个错误
//
//        try{
//            j=10/i;
//        }catch(ArithmeticException e){ //这边的异常填写报错时候控制台输出的灰色字体
//            //e.getMessage();//代表着错误的消息
//            //e.getCause(); // 代表着错误的原因
//            e.printStackTrace();//代表着打印
//            i=10;
//            j=10/i; //这边可以加修改的代码
//
//        }finally {
//            System.out.println("最终执行的代码");
//        }
//
//        System.out.println(j);





    }
}
