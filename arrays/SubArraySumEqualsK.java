import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int sum = 0;
        map.put(0,1);
        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
            if(map.containsKey(sum-k)){
                result = result + map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
    public static void main(String[] args){
        SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subArraySumEqualsK.subarraySum(nums,k));
    }
}
