package chapter05_基础语法_面向对象;

public class java_object_方法重载_重点 {
    public static void main(String[] args){

        //todo 面对对象--方法重载
        // 一个类中,不同重复声明相同的方法,也不能声名相同的属性
        // 这里相同的方法是指 方法名、参数列表相同，和返回值类型无关
        // "重载"：如果方法名相同，但参数列表（个数，顺序，类型）不相同，会认为是不同的方法，只不过名称一样  参数列表(小括号内参数)
        // 相等于方法签名不同
        // 这个方法在java中称之为方法的重载
        // 构造方法也存在方法重载，如：new aaat(xxx)

//        aaat at = new aaat();//括号内不加参数就是调用的原来的方法 加了参数就是调用相关参数的方法
//        at.aaas(111);
//        at.aaas("wx");
//        at.aaas("asd","asq");


    }
}

//class aaat{
//
//    aaat(){
//        System.out.println("构造方法");
//    }
//
//
//    aaat(String nema){
//        System.out.println("构造方法1");
//    }
//
//    void aaas(String asd, String AK){
//        System.out.println("账号密码登录");
//
//    }
//    void aaas(int tel){
//        System.out.println("手机验证码登录");
//
//    }
//    void aaas(String wx){
//        System.out.println("微信登录");
//
//
//    }
//
//
//}