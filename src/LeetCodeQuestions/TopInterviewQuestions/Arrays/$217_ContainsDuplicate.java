package LeetCodeQuestions.TopInterviewQuestions.Arrays;

public class $217_ContainsDuplicate {

    public static void main(String[] args) {
//        int[] nums = {1,2,3,3};
//        int[] nums = {1,2,3,4};
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println("Contains Duplicate: " + containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        int index = 0;
        while(index<nums.length){
            int current = nums[index];
            for (int i=index+1; i< nums.length; i++){
                if (nums[index]==nums[i]) return true;
            }
            index++;
        }
        return false;
    }

//    public static boolean containsDuplicate(int[] nums){
//        for (int i=0; i< nums.length; i++){
//            for (int j=i+1; j< nums.length; j++){
//                if (nums[i]==nums[j]) return true;
//            }
//        }
//        return false;
//    }

}
