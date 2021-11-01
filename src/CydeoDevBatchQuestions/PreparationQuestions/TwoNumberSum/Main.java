package CydeoDevBatchQuestions.PreparationQuestions.TwoNumberSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array =  {3, 5, -4, 8, 16, 1, -1, 6, -8, 2};
        int targetSum = 10;
        System.out.println(Arrays.toString(TwoNumberSum.twoNumberSum(array, targetSum)));

    }

}
