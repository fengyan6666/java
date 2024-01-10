package chapter09_进阶语法_IO;


import java.io.*;

public class java_IO_文件复制流和缓冲流 {
    public static void main(String[] args){


//        //todo 文件复制  + 缓冲流
//        // 将指定的文件内容复制到一个新的文件
//        //todo 数据源文件对象
//
//        File srcFile = new File("D:\\idea\\存放\\java-xuexi\\data\\word.txt");
//        //todo 数据目的地文件对象
//        File destFile = new File("D:\\idea\\存放\\java-xuexi\\data\\word.txt.copy");
//        //todo 文件输入流(管道对象)
//        FileInputStream in = null;
//        //todo 文件输出流(管道对象)
//        FileOutputStream out = null;
//
//
//
//
//        //todo 缓冲输入流(管道对象)
//        BufferedInputStream buffin =  null;
//        //todo 缓冲输出流(管道对象)
//        BufferedOutputStream buffout =  null;
//
//        //todo 缓冲区(水桶)
//        byte[] cache = new byte[1024];//容量
//
//
//        try {
//            in = new FileInputStream(srcFile);
//            out = new FileOutputStream(destFile);
//
//            buffin = new BufferedInputStream(in);
//            buffout = new BufferedOutputStream(out);
//
//
//            //todo 打开阀门，流转数据（输入）
//            int data = -1;
//            //todo 打开阀门，流转数据（输出）
//            //out.write(data);
//
//            //问题1 代码重复性性强//循环解决
//            while((data = buffin.read(cache))!=-1){
//                buffout.write(cache,0,data);//0表示重头开始
//            }
//            //问题2 多读数据怎么办  //todo 如果文件数据已经全部读取完后，那么再去读取数据，结果就是-1，表示无效（结尾）
//
//            data = in.read();
//            out.write(data);
//            data = in.read();
//            if(data != -1){  //todo 如果文件数据已经全部读取完后，那么再去读取数据，结果就是-1，表示无效（结尾）
//                out.write(data);
//
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            if(buffin!=null){
//                try {
//                    buffin.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if(buffout!=null){
//                try {
//                    buffout.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }





    }
}
