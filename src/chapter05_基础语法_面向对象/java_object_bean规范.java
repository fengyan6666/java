package chapter05_基础语法_面向对象;

public class java_object_bean规范 {
    public static void main(String[] args) {

        //todo 面向对象--bean规范
        // 1.主要用于编写逻辑
        // 类：编写逻辑；建立数据模型（Bean）
        // 类必须含有无参、公共的构造方法
        // 属性必须私有化，提供公共的 set、get 方法
        // 如果属性和（局部）变量名称相同，访问时不加修饰符，则优先访问变量
        // 2.用于建立数据模型

   /*     User user = new User();
        user.setAccount("admin");
        user.setPassword("admin");
        System.out.println(login(user));



    }
    public static boolean login(User user){
        if (user.getAccount().equals("admin")&&user.getPassword().equals("admin")){ //获取当前用户和密码对比判断
            return true;
        }else{
            return false;
        }

    }*/
    }
}

/*
class User {

    private String account;
    private String password;

    public void setAccount(String account){//外部给这个赋值或者说设置账号名称
         this.account=account;
    }
    public void setPassword(String password){//外部给这个赋值或者说设置账号密码
        this.password=password;
    }
    public String getAccount(){//用于获取名称 // 例如调用这个方法,这个方法就返回当前的用户名
        return account;
    }
    public String getPassword(){//用于获取密码
        return password;
    }


*/
