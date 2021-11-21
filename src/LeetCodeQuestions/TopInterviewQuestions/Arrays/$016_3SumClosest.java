package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $016_3SumClosest {

    public static void main(String[] args) {

        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));

    }

    static int threeSumClosest(int[] nums, int target) {

        int closest = Integer.MAX_VALUE;
        int output = 0;
        Arrays.sort(nums);
        for(int i=0 ; i< nums.length ; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                int total = nums[i] + nums[right] + nums[left];
                if(Math.abs(total - target) < closest) {
                    closest = Math.abs(total - target);
                    output = total;
                }
                if(total > target) right--;
                else if(total < target) left++;
                else return total;
            }
        }
        return output;
    }

}
