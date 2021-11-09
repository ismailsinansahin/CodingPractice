package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $053_MaximumSubarray {

    public static void main(String[] args) {

        int[] input = {-2,-2,1,-3,4,-1,2,1,-5,22};
        System.out.println(maximumSubarray(input));

    }

    public static int maximumSubarray(int[] nums) {
        int maxSoFar = nums[0];
        int max = nums[0];

        for(int i=1 ; i < nums.length ; i++){
            maxSoFar = Math.max(nums[i], maxSoFar + nums[i]);
            max = Math.max(maxSoFar, max);
        }
        return max;
    }

    public static int maximumSubarrayBruteForce(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0 ; i < nums.length ; i++){
            sum = nums[i];
            for(int j=i+1 ; j < nums.length ; j++){
                sum += nums[j];
                if (sum > max) max = sum;
            }
        }
        return max;
    }

}
