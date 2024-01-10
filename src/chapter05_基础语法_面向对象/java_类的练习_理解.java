package chapter05_基础语法_面向对象;

public class java_类的练习_理解 {
    public static void main(String[] args){
        class Cooking{
            //名字

            //菜的类型
            String name = "红烧排骨";
                //食材
                String food = "排骨";
                //佐料
                String relish = "佐料";
                void ashda(){
                    System.out.println("准备食材"+food);
                    System.out.println("准备佐料"+relish);
                    System.out.println("开始烹饪");
                    System.out.println(name +"烹饪完成");
                }
                void run(){
                System.out.println("第二个方法");


            }

        }
        Cooking c =new Cooking();
        c.ashda();




        class Cookis{
            //名字

            //菜的类型
            String name = "红烧鱼";
            //食材
            String food = "鱼";
            //佐料
            String relish = "佐料";
            void execute(){
                System.out.println("准备食材"+food);
                System.out.println("准备佐料"+relish);
                System.out.println("开始烹饪");
                System.out.println(name +"烹饪完成");
            }

        }
//        Cookis b =new Cookis();
//        b.execute();





        //todo 运行的逻辑程序差不多,更推荐子程序外更改相应变量
        // 定义个新的变量名称用于调用,如果更改里面的相应变量赋值 更加便捷
        // 例如
        Cooking a1 =new Cooking();
        a1.name="红烧鱼";
        a1.food="鱼";
        a1.relish="料酒";
        a1.run();
        c.ashda();





    }
}
