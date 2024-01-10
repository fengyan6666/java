    package chapter09_进阶语法_IO;


import java.io.*;

public class java_IO_Stringbuilder {
    public static void main(String[] args){


//        //todo 字符流
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
//
//
//
//            //todo 打开阀门，流转数据（输入）
//            int data = -1;
//            StringBuilder ss = new StringBuilder();
//
//            while((data = in.read())!=-1){
//                //out.write(data);
//                //System.out.println(data);
//                ss.append((char)data);//追加 //强制转化
//
//                //Unicode编码
//                // 统计用三个字节表示除了ascll以外的字符,所以一个汉字3个字节
//            }
//            ss.append("zhangsan");
//            System.out.println(ss);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            if(in!=null){
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            if(out!=null){
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }





    }
}
