package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class $018_4Sum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};   //-4 -1 -1 0 1 2
        int target = -1;
        System.out.println(fourSum(nums, target));
    }

    static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        int total = 0;

        if(nums.length == 4 && Arrays.stream(nums).sum() == target) {
            List<Integer> temp = Arrays.asList(nums[0],nums[1],nums[2],nums[3]);
            output.add(temp);
            return output;
        }

        Arrays.sort(nums);

        for (int i=0 ; i<nums.length-3 ; i++){
            for(int j=i+1 ; j<nums.length-2; j++){
                int left = j+1;
                int right = nums.length-1;
                while(left < right){
                    total = nums[i] + nums[j] + nums[left] + nums[right];
                    if(total == target) {
                        List<Integer> tempList = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        if(!output.contains(tempList)) output.add(tempList);
                        left++;
                    }
                    else if(total > target) right--;
                    else left++;
                }
            }
        }
        return output;
    }

}
