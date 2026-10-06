package Array.ReverseArray;

public class Solution{
    public static void reverse(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
        
    }
    public static void main(String[] args){
        int[] nums = {1,2,34,4};
        reverse(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}