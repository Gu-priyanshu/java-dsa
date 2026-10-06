package Array.MoveZeroes;

public class Solution {
    public static void movezeroes(int[] nums){
        int nonZero = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] != 0){
            int temp = nums[i];
            nums[i] = nums[nonZero];
            nums[nonZero] = temp;

            nonZero++;
           }
        }
    }

    public static void main(String[] args){
        int[] nums = {1,0,2,0,0,1};
        movezeroes(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
