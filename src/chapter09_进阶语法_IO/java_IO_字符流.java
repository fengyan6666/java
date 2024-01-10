    package chapter09_进阶语法_IO;


import java.io.*;

    public class java_IO_字符流 {
        public static void main(String[] args) {


//            //todo 字符流
//            // 将指定的文件内容复制到一个新的文件
//            //todo 数据源文件对象
//
//            File srcFile = new File("D:\\idea\\存放\\java-xuexi\\data\\word.txt");
//            //todo 数据目的地文件对象
//            File destFile = new File("D:\\idea\\存放\\java-xuexi\\data\\word.txt.copy");
//
//
//            //todo 字符输入流(管道对象)
//            BufferedReader reader = null;//读取
//            //todo 字符输出流(管道对象)
//            PrintWriter writer = null;//输出
//
//
//            try {
//                reader = new BufferedReader(new FileReader(srcFile));//通过字符的方式读取文件
//                writer = new PrintWriter(destFile);
//
//
//                //todo 打开阀门，流转数据（输入）
//                //int data = -1;
//                String line = null;
//
//                while ((line = reader.readLine()) != null) {//整行读取
//                    System.out.println(line);//这样是单行的  多行数据也可以输出出来,字节和字符的转化关系
//                    writer.println(line);//打印
//                }
//                writer.flush();//刷写数据
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                if (reader != null) {
//                    try {
//                        reader.close();
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//                if (writer != null) {
//                    writer.close();
//                }


//            }
    }}
