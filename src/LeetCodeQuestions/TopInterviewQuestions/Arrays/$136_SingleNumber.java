package LeetCodeQuestions.TopInterviewQuestions.Arrays;

public class $136_SingleNumber {

    public static void main(String[] args) {
//        int[] nums = {1};
        int[] nums = {4,1,2,1,2};
//        int[] nums = {2,2,1};
        System.out.println("Single Number is: " + singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        int index = 0;
        int single = 0;
        while(index<nums.length){
            int counter = 0;
            for (int num : nums) {
                if (nums[index] == num) counter++;
            }
            if (counter<2){
                single = nums[index];
                break;
            }
            index++;
        }
        return single;
    }

}
