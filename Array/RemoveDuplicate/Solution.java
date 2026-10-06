package Array.RemoveDuplicate;

public class Solution {
    public static void removeDuplicate(int[] nums){
        int unique = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[unique - 1]){
                nums[unique] = nums[i];
                unique++;
            }
        }

        for(int i = unique; i < nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args){
        int[] nums = {1,2,2,3,4,56,56};
        removeDuplicate(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
