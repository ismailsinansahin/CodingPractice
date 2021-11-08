package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import CydeoDevBatchQuestions.PreparationQuestions.MergeOverlappingIntervals.MergeOverlappingIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class $056_MergeIntervals {

    public static void main(String[] args) {
//        int[][] input = {{1,2},{3,5},{4,6},{6,7},{7,8},{9,20},{10,15},{10,11},{11,11},{15,16},{21,51}};
//        int[][] input = {{2,3},{2,2},{3,4},{3,4},{5,5}};
//        int[][] input = {{0,2},{2,3},{4,4},{0,1},{5,7},{4,5},{0,0}};
//        int[][] input = {{1,2},{1,1},{1,3}};
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        List<int[]> output = MergeOverlappingIntervals.mergeOverlappingIntervals(input);
        for(int[] intervals : output){
            System.out.println(Arrays.toString(intervals));
        }
    }

    public int[][] merge(int[][] input) {
        Arrays.sort(input, Comparator.comparingInt(o -> o[0]));
        List<int[]> output = new ArrayList<>();
        int pointer = 0;
        int tempMin = input[pointer][0];
        int tempMax = input[pointer][1];
        while(pointer < input.length-1) {
            if((tempMax < input[pointer+1][0]) &&
                    (tempMin < input[pointer+1][0]) &&
                    (tempMax < input[pointer+1][1]))
            {
                addInterval(output, tempMin, tempMax);
                pointer++;
                tempMin = input[pointer][0];
                tempMax = input[pointer][1];
            }else{
                pointer++;
                tempMin = Math.min(tempMin, input[pointer][0]);
                tempMax = Math.max(tempMax, input[pointer][1]);
            }
        }
        addInterval(output, tempMin, tempMax);
        int[][] output1 = new int[output.size()][];
        for (int i=0 ; i<output.size() ; i++){
            output1[i] = Arrays.stream(output.get(i)).toArray();
        }
        return output1;
    }

    public static void addInterval(List<int[]> output, int element1, int element2){
        int[]newInterval = new int[]{element1, element2};
        output.add(newInterval);
    }

}
