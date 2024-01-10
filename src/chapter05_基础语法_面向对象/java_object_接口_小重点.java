package chapter05_基础语法_面向对象;

public class java_object_接口_小重点 {
    public static void main(String[] args){

        //todo 面向对象--接口  "小重点"
        // 接口可以理解为规则
        // 语法结构   interface 接口名 { 规则属性，规则的行为}
        // 接口是抽象的，属性是静态的，行为是抽象的!!!
        // 规则属性必须为固定值，而且不能修改!!!
        // 属性和行为的访问权限必须是公共的!!!
        // 接口和类是两个层面的，接口可以继承其他接口，类可以实现多个接口
        // implements(实现)
        // 接口不能创建对象


        //todo 总结 目前 感觉想是接口调用,没有具体讲接口   //后续需要具体在补充学习一下
        // 定义接口和想实现的功能  接口需要被调用的地方和调用的地方 用例子说明 电脑是被调用的地方 灯光是调用的地方
        // 被调用的地方补充想实现的功能的具体逻辑代码 被调用的地方用关键字连接接口的方法
        // 最后创建对象 要先创建被调用的地方在创建调用的地方 最后连接在一起 连接后才能调用功能

//        diannao c = new diannao();
//        dengguang deng = new dengguang();
//        c.USB=deng; // 这里等于灯光插在计算机的usb接口里
//        c.dianyuan();//然后在调用功能

//        baiduwangpan b = new baiduwangpan();
//        wo w = new wo();
//        b.USB=w;
//        b.jieshou();




    }
}
//// 为了方便理解,用中文表示变量结果 // 中文容易乱码,改用拼音
//interface USBjiekou { //usb接口//定义一个接口 把功能包含在接口内部,连接上接口就可以调用
//
//}
//
//interface USBdianyuan extends USBjiekou { //usb电源//usb接口可以实现充电功能 仅仅是名称,具体实现不在这
//    public void dianyuan();//电源充电
//}
//interface USBjieshou extends USBjiekou{ //usb接收//usb接口可以实现接收功能 仅仅是名称,具体实现不在这
//    public void jieshou ();//电源接收
//
//}
//
//class diannao implements USBdianyuan{ // 电脑  usb电源 //定义电脑这个类,用关键字连接到接口的子类usb电源上 这边就是实现充电的地方
//    public USBdianyuan  USB; //定义一个usb接口 可以定义多个
//
//
//    public void dianyuan(){ //定义具体实现逻辑代码
//
//        System.out.println("电脑提供电源"); //输出一下,证明有实现到这边
//        USB.dianyuan ();// 这个代表这个代码是这个方法的具体 就是具体实现的地方
//
//
//
//    }
//
//}
//// 举例写出 文件接收一样
//class baiduwangpan implements USBjieshou{
//    public USBjieshou USB;
//
//    public void jieshou(){
//        System.out.println("百度网盘提供文件");
//        USB.jieshou();
//    }
//}
//
//class wo implements USBjieshou{
//    public void jieshou(){
//        System.out.println("我接收文件");
//    }
//}
//
//
//
//
//
//class dengguang implements USBdianyuan{ // 连接上电源功能 使用充电的地方
//    public void dianyuan (){ //使用电源方法
//        System.out.println("电灯接收电源");
//    }
//}