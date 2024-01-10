package chapter09_进阶语法_IO;

import java.io.File;

public class java_IO_数据流文件流处理 {
    public static void main(String[] args){

        //todo 数据流操作（简单理解：数据从哪里来,到哪里去
        // 数据源-->管道-->数据目的地
        // IO   I:Input,输入（In） O：Output,输出（out） 管道：Stream(流转)
        // java管道不止一个  java管道是不一样的


        //todo 文件流操作
        // 文件源-->管道-->文件目的地（系统文件）
        // java不能直接访问文件
        // File：文件类型,属于java.io

        //创建文件对象,使用文件路径关联系统文件
        String filePath ="D:\\idea\\存放\\java-xuexi\\data\\word.txt";
        File file = new File(filePath);//需要填写文件路径
//        System.out.println(file);
//        // 文件对象解析 //判断当前的文件是否为文件 //返回逻辑型 //如果关联的路径不存在,就都返回false
//        System.out.println(file.isFile());
//        //判断当前的文件是否为文件j夹  //返回逻辑型
//        System.out.println(file.isDirectory());
//        //判断文件对象是否存在关联
//        System.out.println(file.exists());

        //正常应该这么写
//        if(file.exists()){
//            //文件存在的情况
//            System.out.println("文件对象存在");
//            if(file.isFile()){
//                System.out.println("关联对象是一个文件");
//                System.out.println(file.getName());//获取文件名称
//                System.out.println(file.length());//获取文件大小
//                System.out.println(file.lastModified());//获取最后修改时间
//                System.out.println(file.getAbsoluteFile());//获取文件路径
//            } else if (file.isDirectory()) {
//                System.out.println("关联对象是一个文件夹");
//                System.out.println(file.getName());//获取文件夹名称
//                System.out.println(file.lastModified());//获取最后修改时间
//                System.out.println(file.getAbsoluteFile());//获取文件夹路径
//                String[] list = file.list();//获取文件夹中的文件
//                System.out.println("获取文件夹中的文件");
//                for (String s : list) {
//                    System.out.println(s);
//                }
//                File[] files =file.listFiles();//获取文件夹中的每一个文件你对象
//                for (File s : files) {
//                    System.out.println(s);
//
//                }
//
//            }
//        }else{
//            //文件不存在的情况
//            System.out.println("文件对象不存在,没有关联成功");
//            //创建多级文件目录
//            //file.mkdirs();//创建当前目录,没有就创建
//             // 创建新文件
//           // file.createNewFile();//
//        }

    }
}
