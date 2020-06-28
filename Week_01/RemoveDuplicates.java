/**
 * Geek University
 * 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = removeDuplicates(nums);
        System.out.println(len);
        
        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int removeDuplicates(int[] nums) {
        int len = 1;
        int numi;
        boolean flag;
        for (int i = 0; i < nums.length; i++) {
            flag = false;
            // 遍历数组，比较当前位置i的值与其后面值，如果后面的值大，则交换到i的后面位置
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    numi = nums[i + 1];
                    nums[i + 1] = nums[j];
                    nums[j] = numi;
                    // 交换后，统计元素的个数
                    len++;
                    // 如果遇到后面的值比当前值大，则认为需要交换，并且还需要继续
                    flag = true;
                    break;
                }
            }
            // 如果交换flag显示不再需要交换，则退出程序
            if (!flag) {
                break;
            }
        }
        return len;
    }
}