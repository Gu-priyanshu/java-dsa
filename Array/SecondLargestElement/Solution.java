package Array.SecondLargestElement;

public class Solution {
    public static int secondLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest && nums[i] < largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int result = secondLargest(nums);
        System.out.println(result);
    }
}
