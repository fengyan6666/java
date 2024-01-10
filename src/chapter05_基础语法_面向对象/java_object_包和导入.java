package chapter05_基础语法_面向对象;
import java.util.ArrayList;
import java.util.Date;
public class java_object_包和导入 {
    public java_object_包和导入() {
    }

    public static void main(String[] args){
        //todo 面向对象--"包"(Packacg)
        // packacg中容纳类
        // 基本语法: packacg 包完整路径
        // 路径中的多个包用点隔开 .
        // java.lang.object
        // 主要功能用于分类管理
        // 一个类可以没有包，但不能使用多次
        // 为了区分类名，一般都是小写 如：java（包）.lang（包）.Object（类）
        // 	Java 中存在不同包的相同名称的类，可以写类的全名加以区分（包名 + 类名） 如: new java.util.Data()
        // 相同类名字 不用包区分会混淆




        //todo 面向对象--"导入"(import)
        // 只有java.lang里的类名可以直接使用  因为JVM 会在使用时自动添加 java.lang 包
        // 还有当前的包不需要导入,其他包均需要
        // 其他包里需要填写路径
        //例如:
        //java.lang.String.name ="zhangsan";
        //其他包
        //new chapter05.java10_Object_Import();
        //new java10_Object_Import();




        //todo 所以java提供了import语法
        // 可以使用 import 在使用类前导入包（位于 package 后，class 前），可以多次使用    (开头地方)
        // 如果 import 了不同包中相同名称的类，如 Date，使用时最好还是增加包名
        // import 主要用于在使用类前准备好了
        // import 关键字可以多次使用,导入多个类
        // 如果同一个包中需要导入大量的类 可以使用通配符来简化操作*  如 import java.util.Date; -->>import java.util.*;
        // 自动导包 在需要导包的语句行按下快捷键 alt+enter
        //例如:
        //import java.util.Date;

        new ArrayList();


    }

}
