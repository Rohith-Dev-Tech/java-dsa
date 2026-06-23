import java.util.Arrays;

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int maxProd = 0;
        for(int j = 0 ; j < nums.length ; j++){
            prod = prod * nums[j];
            if(prod>maxProd){
                maxProd = prod;
            }
            if(prod < 1){
                prod = 0;
            }
        }
        return maxProd;
    }
    public static void main(String[] args){
        MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
        int[] nums = {2,3,-2,4};
        System.out.println(maxProductSubArray.maxProduct(nums));
    }
}
