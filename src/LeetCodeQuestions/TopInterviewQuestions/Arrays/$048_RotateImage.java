package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $048_RotateImage {

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("Input   = " + Arrays.deepToString(matrix));
        rotate(matrix);
        System.out.println("Output  = " + Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        int temp;
        int k=0;
        for (int i=matrix.length-1 ; i>=matrix.length/2 ; i--,k++){
            for (int j=i ; j>k ; j--) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i-j+k][i];
                matrix[i-j+ k][i] = matrix[k][i-j+k];
                matrix[k][i-j+k] = matrix[j][k];
                matrix[j][k] = temp;
            }
        }
    }

}
