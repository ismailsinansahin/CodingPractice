package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $026_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Input  : " + Arrays.toString(nums));
        System.out.println("Output : " + removeDuplicates(nums) + ", nums = " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int counter=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]>=nums[nums.length-1]){
                counter++;
                break;
            }
            for (int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]) {
                    nums[i+1] = nums[j];
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

}
