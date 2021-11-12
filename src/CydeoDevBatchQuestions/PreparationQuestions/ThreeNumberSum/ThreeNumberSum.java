package CydeoDevBatchQuestions.PreparationQuestions.ThreeNumberSum;

import java.util.*;

public class ThreeNumberSum {

    public static List<List<Integer>> threeNumberSumN(int[] array, int targetSum) {
        Arrays.sort(array);
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == targetSum) {
                    output.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                }
                else if (currentSum < targetSum) left++;
                else right--;
            }
        }
        return output;
    }

    public static List<List<Integer>> threeNumberSumN3(int[] array, int targetSum){
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if(array[i] + array[j] + array[k] == targetSum){
                        output.add(Arrays.asList(array[i], array[j], array[k]));
                    }
                }
            }
        }
        return output;
    }

}
