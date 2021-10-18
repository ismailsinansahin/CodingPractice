package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $189_RotateArray {
    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
//        int[] nums = {-1, -100, 3, 99};
//        int[] nums = {-1};
        int[] nums = {1,2,3,4,5};
        int k = 7;
        System.out.println("Input  : nums = " + Arrays.toString(nums) + ", k = " + k);
        shiftRight(nums, k);
        System.out.println("Output : nums = " + Arrays.toString(nums));
    }

    public static void shiftRight(int[] nums, int k){
        int newIndex=0;
        int[] rotated= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            newIndex=(i+k)%nums.length;
            rotated[newIndex]=nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = rotated[i];
        }
    }

}
