package chapter06_基础语法_常用类;

import java.sql.SQLOutput;

public class java_数组 {
    public static void main(String[] args){

        //todo 常见类和对象  '数组' 和c一样
        // 类型[] 变量 = new 类型[容量]
        //	注意数组的索引范围（0 ~ length - 1）
        //	二维数组：x行x列
        // length 关键词 获取当前数组容量

        //数组例子
       /* User[] user = new User[5];

        for(int i = 0;i<user.length;i++){
            user[i] = new User();
        }
        for(int i = 0;i<user.length;i++){
            user[i].test();
        }*/

        //二维数组例子
        /*String[][] name = new String[3][3];
        name[1][2]="zhangsan";
        name[0][2]="lisi";
        name[0][1]="zhaoliu";

        for(int i = 0;i<3;i++){ //行
            for(int j = 0;j<3;j++){ //列
                System.out.print(name[i][j]+"  ");
            }
            System.out.println();
        }
*/
    }
}
//数组例子
/*class User {
    public void test(){
        System.out.println("test...");
    }
}*/
