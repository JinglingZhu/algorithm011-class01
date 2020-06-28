/**
 * Geek University
 * 两数之和
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 5, 11 };
        int target = 10;

        int[] twoNumbers = twoSum(nums, target);
        System.out.println("[" + twoNumbers[0] + ", " + twoNumbers[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}