package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $167_TwoSum2_InputArrayIsSorted {

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
        int head = 0 ;
        int tail = nums.length-1;
        while(head<tail){
            int totalTwo = nums[head] + nums[tail];
            if(totalTwo == target) return new int[] {head+1, tail+1};
            if(totalTwo < target) head++;
            if(totalTwo > target) tail--;
        }
        return new int[0];
    }

    public static int[] twoSum2(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(!map.containsKey(numbers[i])) map.put(target-numbers[i], i+1);
            else return new int[] {map.get(numbers[i]), i+1};
        }
        return new int[0];
    }

}
