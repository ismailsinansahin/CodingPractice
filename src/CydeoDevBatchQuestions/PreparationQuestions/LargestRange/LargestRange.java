package CydeoDevBatchQuestions.PreparationQuestions.LargestRange;

import java.util.Arrays;

public class LargestRange {

    public static int[] largestRange(int[] input){

        int[] output = new int[2];
        int current = 1;
        int tempMin = 0;
        int tempMax = 0;
        int range = 0;

        if(input.length == 1) return input;
        if(input.length == 2) range--;

        Arrays.sort(input);

        while(current < input.length-1){

            if(isConsecutive(input, current)){
                tempMax = current;
                current++;
            }else if(isRangeGreaterThanPrevious(tempMin, tempMax, range)){
                fillOutputArray(input, output, tempMin, tempMax);
                range = tempMax - tempMin;
                current++;
                tempMin = current-1;
            }else{
                current++;
                tempMin = current-1;
            }
        }

        if(isConsecutive(input, current)) tempMax = current;
        if(isRangeGreaterThanPrevious(tempMin, tempMax, range)) fillOutputArray(input, output, tempMin, tempMax);

        return output;

    }

    static void fillOutputArray(int[] input, int[] output, int tempMin, int tempMax){
        output[0] = input[tempMin];
        output[1] = input[tempMax];
    }

    static boolean isConsecutive(int[] input, int current){
        return input[current-1] == input[current] - 1;
    }

    static boolean isRangeGreaterThanPrevious(int tempMin, int tempMax, int range){
        return tempMax - tempMin > range;
    }

}