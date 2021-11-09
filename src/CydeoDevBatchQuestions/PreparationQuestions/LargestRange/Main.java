package CydeoDevBatchQuestions.PreparationQuestions.LargestRange;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[] input = {1,11,3,0,15,5,2,4,10,7,12,6};
        int[] input = {1,2,3,4,5,6,7,10,11,12,13,14,15,16,17,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37};
//        int[] input = {1,2,3,4,5,6};
//        int[] input = {1,1,2,3,4,5,7,8,8,8,8,8,8,9,9,9,9};
//        int[] input = {1,2,4};
//        int[] input = {1};
//        int[] input = {2,2};
//        int[] input = {1,2};
//        int[] input = {1,2,3,4,7,8,9,10,11};
        System.out.println(Arrays.toString(LargestRange.largestRange(input)));

    }

}
