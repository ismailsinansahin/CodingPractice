package CydeoDevBatchQuestions.PreparationQuestions.MergeOverlappingIntervals;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[][] input = {{1,2},{3,5},{4,6},{6,7},{7,8},{9,20},{10,15},{10,11},{11,11},{15,16},{21,51}};

//        int[][] input = {{2,3},{2,2},{3,4},{3,4},{5,5}};

//        int[][] input = {{0,2},{2,3},{4,4},{0,1},{5,7},{4,5},{0,0}};

        int[][] input = {{1,2},{1,1},{1,3}};

//        int[][] input = {{1,3},{2,6},{8,10},{15,18}};

        List<int[]> output = MergeOverlappingIntervals.mergeOverlappingIntervals(input);

        for(int[] intervals : output){
            System.out.println(Arrays.toString(intervals));
        }

    }

}
