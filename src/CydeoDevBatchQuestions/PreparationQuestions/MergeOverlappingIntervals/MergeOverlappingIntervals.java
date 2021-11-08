package CydeoDevBatchQuestions.PreparationQuestions.MergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

    static int current = 0;
    static int next = current + 1;
    static int tempMin;
    static int tempMax;

    public static List<int[]> mergeOverlappingIntervals(int[][] input){

        Arrays.sort(input, Comparator.comparingInt(o -> o[0]));
        List<int[]> output = new ArrayList<>();

        tempMin = input[current][0];
        tempMax = input[current][1];

        while(current < input.length-1) {
            boolean happyPath = (tempMax < input[next][0]) && (tempMax < input[next][1]) && (tempMin < input[next][0]);
            if(happyPath){
                addInterval(output, tempMin, tempMax);
                goNext();
                tempMin = input[current][0];
                tempMax = input[current][1];
            }else{
                goNext();
                tempMin = Math.min(tempMin, input[current][0]);
                tempMax = Math.max(tempMax, input[current][1]);
            }
        }
        addInterval(output, tempMin, tempMax);
        return output;
    }

    public static void addInterval(List<int[]> output, int element1, int element2){
        int[]newInterval = new int[]{element1, element2};
        output.add(newInterval);
    }

    public static void goNext(){
        current++;
        next++;
    }

}
