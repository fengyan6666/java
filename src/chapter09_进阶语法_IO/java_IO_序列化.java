
package chapter09_进阶语法_IO;


import com.sun.source.tree.NewArrayTree;

import java.io.*;

public class java_IO_序列化 {
    public static void main(String[] args){


////        //todo 序列化和反序列化
////        // 将指定的文件内容复制到一个新的文件
////        //todo 数据文件对象
//        File dataFile = new File("D:\\idea\\存放\\java-xuexi\\data\\obj.dat");
//
//        //todo 对象输出流(管道对象)
//        ObjectOutputStream objectout = null;
//        FileOutputStream out = null;
//
//        //todo 对象输入流
//        ObjectInputStream ObjectIn = null;
//        FileInputStream in = null;
//        try {
////            out = new FileOutputStream(dataFile);
////            objectout = new ObjectOutputStream(out);//括号里还需要一个文件输出流
////            User user = new User();
////            //java中只有添加了特殊的标记的类,才能在写文件时进行序列化操作
////            //这里的特殊标记指的是一个接口
////            objectout.writeObject(user);//写对象
////            objectout.flush();//刷写数据
//            //TODO 从文件中读取数据转化成对象
//            in = new FileInputStream(dataFile);
//            ObjectIn = new ObjectInputStream(in);
//            Object o = ObjectIn.readObject();//没有相关类型读取
//            System.out.println(o);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }finally {
//            if(objectout!=null){
//                try {
//                    objectout.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//
//            }
       }
//
//
//
//
//
    }
//
//class User implements Serializable{//Serializable表示告诉java虚拟机我要进行序列化操作法国人
//
//}