package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class $015_3Sum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("threeSum(nums) = " + threeSumWithStreamDistinct(nums));
    }

//    public static List<List<Integer>> threeSumWithRecursive(int[] nums){
//        Arrays.sort(nums);
//        List<List<Integer>> output = new ArrayList<>();
//        for(int i=0 ; i<nums.length-2 ; i++){
//            twoSum(new ArrayList.of())
//
//        }
//        return output.stream().distinct().collect(Collectors.toList());
//    }
//
//    public static int[] twoSum(int[] array, int totalSum){
//        int[] result = new int[2];
//        Arrays.sort(array);
//        int left = 0 ;
//        int right = array.length-1;
//        while(left<right){
//            int totalTwo = array[left] + array[right];
//            if(totalTwo == totalSum) return new int[] {array[left], array[right]};
//            if(totalTwo < totalSum) left++;
//            if(totalTwo > totalSum) right--;
//        }
//        return new int[0];
//    }

    public static List<List<Integer>> threeSumWithStreamDistinct(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for(int i=0 ; i<nums.length-2 ; i++){
            if((i>0) && (nums[i] == nums[i-1])) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0) {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }else right--;
            }
        }
        return output.stream().distinct().collect(Collectors.toList());
    }

}
