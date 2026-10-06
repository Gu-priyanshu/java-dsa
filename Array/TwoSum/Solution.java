package Array.TwoSum;

import java.util.HashMap;

public class Solution {
    public static int[] twoSum(int[] nums, int target){
        HashMap < Integer, Integer > map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] result = twoSum(nums, target);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
