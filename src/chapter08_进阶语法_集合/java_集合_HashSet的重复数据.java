package chapter08_进阶语法_集合;

import java.util.HashSet;

public class java_集合_HashSet的重复数据 {
    public static void main(String[] args){
        //todo HashSet-重复数据
        // 底层数据结构为   数组+链表
//        HashSet set = new HashSet();
//        User01 user01 = new User01();
//        user01.id=1001;
//        user01.name="zhangsna";
//        System.out.println(user01.hashCode());//获取对象在内存的地址
//        User01 user02 = new User01();
//        user02.id=1001;
//        user01.name="zhangsna";
//        System.out.println(user02.hashCode());
//        User01 user03 = new User01();
//        user02.id=1002;
//        user03.name="lisi";
//        System.out.println(user03.hashCode());
//        //地址不同,所以对象不同,不算重复数据
//
//        set.add(user01);
//        set.add(user02);
//        set.add(user03);
//        System.out.println(set);


    }
}

//class User01{
//    public int id;
//    public  String name;
//
//    //重写方法
//    @Override // 类似内存地址
//    public int hashCode() {
//        return id;
//    }
//
//    @Override //判断两个对象的属性是否相同
//    public boolean equals(Object obj) {
//
//        if (obj instanceof User01) {//判断类型是否相同
//            User01 otherUser = (User01) obj; //不相同强制转化
//            if (otherUser.id==this.id) {
//                if (otherUser.name.equals(this.name)) {
//                    return true;
//                }
//            }
//            return false;
//        }else {
//            return false;
//        }
//
//    }
//
//    @Override
//    public String toString() {
//        return "User["+id+","+name+"]";
//    }
//}
