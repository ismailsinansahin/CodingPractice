package CydeoDevBatchQuestions.PreparationQuestions.TwoNumberSum;

import java.util.Arrays;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int totalSum){

        int[] result = new int[2];
        Arrays.sort(array);

        int head = 0 ;
        int tail = array.length-1;

        while(head<tail){

            if(array[head] + array[tail] == totalSum) {
                result[0] = array[head];
                result[1] = array[tail];
                return result;
            }

            if(array[head] + array[tail] < totalSum) head++;
            if(array[head] + array[tail] > totalSum) tail--;
        }

        return new int[0];

    }

}
