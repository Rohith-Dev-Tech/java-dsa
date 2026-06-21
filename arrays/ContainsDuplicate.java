import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i =0; i<nums.length; i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        Solution solution = new Solution();
        boolean answer = solution.containsDuplicate(nums);
        System.out.println(answer);
    }
}