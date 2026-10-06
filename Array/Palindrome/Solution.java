package Array.Palindrome;

public class Solution{
    public static boolean isPalindrome(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if(nums[left] != nums[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {1,2,2,1};
        boolean result = isPalindrome(nums);
        System.out.println(result);
    }
}