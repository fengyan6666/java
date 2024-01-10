package chapter04_基础语法_流程控制;

import java.util.jar.JarEntry;

public class java_flowcontrlo_练习 {
    public static void main(String[] agrs){
        //todo 流程控制-"九层妖塔"

        //事例
        /*
              *
             ***
            *****
           *******
        */
            //println方法输出后会自动添加换行符
            //print 方法输出后不自动换行
        int lever=9;  //优化后只需要改这个数值就可以修改层数
        for(int i =0; i<lever; i++){          //这个循环用来控制层数
            for(int k = 0; k<lever-i; k++){   //这个循环用来控制每层输入的空格数
                System.out.print(" ");
            }
            for(int j = 0; j<i*2+1; j++){  //这个循环用来控制每层输入的*数量
               System.out.print("*");
           }
           System.out.println("");
        }

        //唯一的难点在于空格



    }
}
