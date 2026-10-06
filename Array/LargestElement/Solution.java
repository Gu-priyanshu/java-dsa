public class Solution{
    public static int largestElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int max = largestElement(nums);
        System.out.println(max);
    }
}