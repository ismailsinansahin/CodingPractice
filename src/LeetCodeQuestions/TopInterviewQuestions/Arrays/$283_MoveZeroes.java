package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $283_MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        int[] nums = {0};
//        int[] nums = {0,0,1};
        System.out.println("Input  : " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("Output : " + Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums){
        int counter = 0;
        int i = 0;
        while (i< nums.length-counter) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length-1 ; j++){
                    nums[j]=nums[j+1];
                }
                counter++;
                nums[nums.length-counter]=0;
                i=-1;
            }
            i++;
        }
    }

}
