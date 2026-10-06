package Array.PrefixSum;

public class Solution{
    public static int[] prefixSum(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] prefix = prefixSum(nums);
        for(int num : prefix){
            System.out.print(num + " ");
        }
    }
}