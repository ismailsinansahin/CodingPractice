package CydeoDevBatchQuestions.PreparationQuestions.TraverseSpiralArrays;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[][] input = {{1,2,3,4,5,6},
//                         {20,21,22,23,24,7},
//                         {19,32,33,34,25,8},
//                         {18,31,36,35,26,9},
//                         {17,30,29,28,27,10},
//                         {16,15,14,13,12,11}};

//        int[][] input = {{1,2,3,4},
//                         {12,13,14,5},
//                         {11,16,15,6},
//                         {10,9,8,7}};

        int[][] input = {{1, 2, 3, 4},
                         {8, 7, 6, 5}};

//        int[][] input = {{1,2},
//                         {4,3}};

        System.out.println(Arrays.deepToString(input));

        List<Integer> output = TraverseSpiralArrays.spiralTraverseIterative(input);

//        List<Integer> output = TraverseSpiralArrays.spiralTraverse(input);

//        int[] output = TraverseSpiralArrays.getOneDimensionalArray(input);

        System.out.println(output);

    }

}
