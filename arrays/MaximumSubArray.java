import java.util.Arrays;

class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int j = 0;
        int max = nums[0];
        int currentSum = 0;

        while (j < nums.length) {
            currentSum += nums[j];
            if (currentSum > max) {
                max = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
                i = j + 1;
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        MaximumSubArray solution = new MaximumSubArray();
        int answer = solution.maxSubArray(nums);
        System.out.println(answer);
    }
}