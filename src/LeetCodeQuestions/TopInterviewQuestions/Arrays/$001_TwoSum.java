package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $001_TwoSum {

    public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        int[] nums = {3,2,4};
//        int target = 6;
//        int[] nums = {3,3};
//        int target = 6;
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println("Input  : " + Arrays.toString(nums));
        System.out.println("Target : " + target);
        System.out.println("Output : " + Arrays.toString(twoSum1(nums,target)));
    }

    public static int[] twoSum1(int[] nums, int target){
        for(int i = 1 ; i < nums.length ; i++){
            for(int j = i ; j < nums.length ; j++){
                if(nums[j - i] + nums[j] == target){
                    return new int[] {j - i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target){
        int[] twoSum = new int[2];
        for (int i=0 ; i< nums.length ; i++){
            for (int j=i+1 ; j<nums.length ; j++){
                if (nums[i]+nums[j]==target){
                    twoSum[0]=i;
                    twoSum[1]=j;
                    return twoSum;
                }
            }
        }
        return twoSum;
    }

    public static int[] twoSum3(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) map.put(target-nums[i], i);
            else return new int[] {map.get(nums[i]), i};
        }
        return new int[0];
    }

}
