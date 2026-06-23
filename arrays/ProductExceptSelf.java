import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int [nums.length];
        //Left indexes product
        int leftProduct = 1;
        for(int i = 0; i<nums.length ; i++){
            result[i]=leftProduct;
            leftProduct = leftProduct * nums[i];
        }
        // Right indexes Product
        int rightProduct = 1;
        for(int i = nums.length-1 ; i>=0 ; i--){
            result[i] = result[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return result;
    }
    public static void main(String[] args){
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf.productExceptSelf(nums)));
    }
}
