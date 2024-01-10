package chapter02_基础语法_变量及数据类型;

public class java_ldentifier {
    public static void main(String[] args){
        //todo 标识符的学习
        // 标识数据的符号 叫标识符
        // 变量名称就是标识符 在一个大括号内,标识符不能重复,相当于变量名称不能重复,有了name就不能在声明一个name;
        // 标识符主要用于起名
        // 标识符是区分大小写的;因为大小写字母在编译后字节集是不一样的;
        //String name = "zahngsan";
        // System.out.println(name);

        //todo 标识符的命名规则 标识符的规范使用取决于自己或者是将来公司指定的格式 英文单词或者拼音再或者是数字 方便自己最好
        //todo 1.英文拉丁字母
        //下面是例子
        // String username = "zhangsan";
        // String xingming = "lisi";
        // System.out.println(username);
        // System.out.println(xignming);

        //todo 2.符号
        // 符号只能使用 "_"和"$" 下滑线和美元
        // 例如#,%,@,甚至是空格 这些都叫特殊符号,标识符不能使用,可以说变量的取名不能碰这些符号,会报错
        //下面是例子
        // String _name = "zhangsan";
        // String $name = "zhangsan";
        // String _na$me = "zhangsan";
        // String $na_me = "zhangsan";
        // System.out.println(_name);
        // System.out.println($name);
        // System.out.println(_na$me);
        // System.out.println($na_me);

        //错误例子
        // String @name = "zhangsan";
        // System.out.println(@name);

        //todo 3.阿拉伯数字
        // 阿拉伯数字 0-9 可以作为标识符使用
        // 数字如果放在开头位置,会被识别成数字,不会被识别为标识符,会报错
        //下面是例子
        // String name1 = "zhangsan";
        // String n1ame = "zhangsan";
        // String na1me = "zhangsan";
        // String nam1e = "zhangsan";
        // System.out.println(name1);
        // System.out.println(n1ame);
        // System.out.println(na1me);
        // System.out.println(nam1e);

        //错误例子
        // String 1name = "zhangsan";
        // System.out.println(1name);

        //todo 4.中文 韩文 日文
        // 标识符中中文韩文日文都可以使用当成标识符 但是行业规范或者说是标准不允许 还是尽量使用上面三种标识类型 容易出现乱码
        //下面是例子
        //String 一三 = "zhagnsan";
        //System.out.println(一三);

        //todo 5.java语言中已经定义了一些标识符名称,称之为关键字或者保留字
        // 可以通过大小写替换在使用,但不推荐,容易混淆或造成歧义
        //错误例子
        // String void = "zhangsan";
        // System.out.println(void);

        //正确例子
        // String VOid = "zhagnsan";/一位大写代表着另一个变量
        // System.out.println(VOid);

        //todo 6.规范编程 "驼峰标识"
        // 命名时有两个单词组合在一起 例如 username 这种组合在一起的标识符,一般要在第二个单词的首字母用大写表示
        // 例如 userName 这是一种规范写法,也好分清,但是这只是一个默认规则,不规范也不会报错

        //todo 7.标识符的长度 没有限制!!!











    }

}
