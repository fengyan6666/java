package chapter06_基础语法_常用类;

public class java_选择排序 {
    public static void main(String[] args) {

        //todo 选择排序
        // 选择排序：先选择一个值作为最大值，再挨个比较，最后找到最大值索引并交换
        // 遍历一遍找到最大值的下标
        // 简单讲,数组全拿出来,第一遍把当前最大的数放进去,第二遍再把当前最大的数放在刚刚放进去的数字的前面,以此类推直到没有
        // 下标索引 从0开始
  /*      int[] nums = {5, 3, 7, 1, 2};
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = 0; //这个变量记录着当前的最大索引也就是当前最大值,用来判断的
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }

            }
            int num;
            num=nums[maxIndex];         //一样的,交换变量
            nums[maxIndex]=nums[nums.length - i - 1];
            nums[nums.length - i - 1]=num;


        }
        for (int i : nums) { //一样的,遍历输出
            System.out.println(i);

        }
*/
    }
}