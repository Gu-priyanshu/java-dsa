package Array.RangeSumQuery;

public class Solution{
    public static int[] prefixSum(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R){
        if(L == 0){
            return prefix[R];
        }
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int L = 1;
        int R = 3;
        int[] prefix = prefixSum(nums);
        int sum = rangeSum(prefix, L, R);
        System.out.println(sum);
    }
}