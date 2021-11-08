package CydeoDevBatchQuestions.PreparationQuestions.TraverseSpiralArrays;

import java.util.ArrayList;
import java.util.List;

public class TraverseSpiralArrays {

    public static List<Integer> spiralTraverseIterative(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();
        var result = new ArrayList<Integer>();
        var startRow = 0;
        var endRow = array.length - 1;
        var startCol = 0;
        var endCol = array[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }
            for (int col = endCol - 1; col >= startCol; col--) {
                if (startRow == endRow) break;
                result.add(array[endRow][col]);
            }
            for (int row = endRow - 1; row > startRow; row--) {
                if (startCol == endCol) break;
                result.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }

    public static int[] transform(int[][] arr){
        int lastRow = arr.length-1;
        int lastCol = arr[0].length-1;
        int j=0,i=0,offset=0;

        int[] result = new int[(lastCol+1)*(lastRow+1)];

        for(int l=0;l< result.length;l++){

            result[l] = arr[i][j];

            if(i==offset && j<lastCol-offset) j++;
            else if(j==lastCol-offset && i<lastRow-offset) i++;
            else if(i==lastRow-offset && j>offset) j--;
            else if(j==offset && i>offset) i--;

            if(i==offset && j == offset){
                offset++;
                i++;
                j++;
            }
        }
        return result;
    }

    // O(n) time | O(n) space - where n is the total number of elements in the array
    public static List<Integer> spiralTraverse(int[][] array) {
        if (array.length == 0) return new ArrayList<Integer>();
        var result = new ArrayList<Integer>();
        spiralFill(array, 0, array.length - 1, 0, array[0].length - 1, result);
        return result;
    }

    public static void spiralFill(int[][] array, int startRow, int endRow, int startCol, int endCol,
                                  ArrayList<Integer> result) {
        if (startRow > endRow || startCol > endCol) {
            return; // termination
        }
        for (int col = startCol ; col <= endCol ; col++) {
            result.add(array[startRow][col]);
        }
        for (int row = startRow + 1 ; row <= endRow ; row++) {
            result.add(array[row][endCol]);
        }
        for (int col = endCol - 1 ; col >= startCol ; col--) {

            if (startRow == endRow) break;
            result.add(array[endRow][col]);
        }
        for (int row = endRow - 1 ; row >= startRow + 1 ; row--) {
            if (startCol == endCol) break;
            result.add(array[row][startCol]);
        }
        //calling method recursively again
        spiralFill(array, startRow + 1, endRow - 1, startCol + 1, endCol - 1, result);
    }

    public static int[] getOneDimensionalArray(int[][] input){
        int[] output = new int[input.length * input.length];
        int dimension = input.length-1;
        int place = 0;
        for (int i=0 ; i<=dimension ; i++){
            for(int j = i ; j<=(dimension-i) ; j++){
                output[place] = input[i][j];
                place++;
            }
            for(int j = i+1 ; j<=(dimension-i) ; j++){
                output[place] = input[j][dimension-i];
                place++;
            }
            for(int j = i+1 ; j<=(dimension-i) ; j++){
                output[place] = input[dimension-i][dimension-j];
                place++;
            }
            for(int j = i+1 ; j<=(dimension-i-1) ; j++){
                output[place] = input[dimension-j][i];
                place++;
            }
        }
        return output;
    }

}
