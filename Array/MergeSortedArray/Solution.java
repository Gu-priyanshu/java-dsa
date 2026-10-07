package Array.MergeSortedArray;

public class Solution {
    public static int[] mergeSortedArray(int[] nums, int[] arr){
        int n = nums.length;
        int m = arr.length;
        int[] mergeArr = new int[n+m];

        int i = 0;
        int j = 0;
        int k = 0;
         
        while(i < n && j < m){
            if(nums[i] < arr[j]){
                mergeArr[k] = nums[i];
                k++;
                i++;
            }else{
                mergeArr[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i < n){
            mergeArr[k] = nums[i];
            k++;
            i++;
        }

        while(j < m){
            mergeArr[k] = arr[j];
            k++;
            j++;
        }

        return mergeArr;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] arr = {2,3,5,6,8,9};

        int[] mergeArr = mergeSortedArray(nums, arr);
        for(int num : mergeArr){
            System.out.print(num + " ");
        }
    }
}
