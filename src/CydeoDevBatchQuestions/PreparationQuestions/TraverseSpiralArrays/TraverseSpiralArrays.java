package CydeoDevBatchQuestions.PreparationQuestions.TraverseSpiralArrays;

public class TraverseSpiralArrays {

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
