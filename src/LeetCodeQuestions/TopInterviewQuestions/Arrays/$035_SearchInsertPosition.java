package LeetCodeQuestions.TopInterviewQuestions.Arrays;

public class $035_SearchInsertPosition {

    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsertPosition(nums, target));

    }

    static int searchInsertPosition(int[] numbers, int target){
        int beginIndex = 0;
        int lastIndex = numbers.length-1;
        int limitingIndex = (beginIndex + lastIndex) / 2;
        if(target <= numbers[beginIndex]) return beginIndex;
        else if(target == numbers[lastIndex]) return lastIndex;
        else if(target > numbers[lastIndex]) return lastIndex+1;
        else{
            while(lastIndex - beginIndex > 1){
                if (target == numbers[limitingIndex]) return limitingIndex;
                else if (target < numbers[limitingIndex]) lastIndex = limitingIndex;
                else beginIndex = limitingIndex;
                limitingIndex = (beginIndex + lastIndex)/2;
            }
        }
        return limitingIndex+1;
    }

}
