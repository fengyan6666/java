package chapter07_基础语法_异常;

public class java_异常 {
    public static void main(String[] args){
        //todo 异常(错误)
        // 分为 运行期异常 RuntimeException 和 编译期异常 Exception
        // 运行期异常： 可以通过代码恢复正常逻辑执行的异常,称之为运行期异常（最大范围的类：RuntimeException）
        // 编译期异常：不可以通过代码恢复正常逻辑执行的异常,称之为编译期异常,控制台会提示,例如服务器没开,程序无法正常运行就是编译器异常
        //	算术异常、空指针异常（成员属性或方法为空）
        //	索引越界、字符串索引越界（索引越界:超过容量大小）(字符串索引越界:查找字符串位置错误)
        //	格式化异常、类型转换错误 （错误转换方式）
        //	提前声明：throws Exception、throw new Exception()
        //	自定义异常，准确描述错误场景
    }
}
