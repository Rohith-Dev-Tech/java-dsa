
import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            int diff = target-nums[i];
            if(result.containsKey(diff)){
                return new int[] {result.get(diff),i};
            }
            result.put(nums[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum solution = new TwoSum();
        int[] answer = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(answer));
    }
}
