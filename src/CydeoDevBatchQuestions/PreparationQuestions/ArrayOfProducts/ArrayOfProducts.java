package CydeoDevBatchQuestions.PreparationQuestions.ArrayOfProducts;

public class ArrayOfProducts {

    public static int[] getArrayOfProducts(int[] array){

        var result = 1;

        for(int each : array) result *= each;

        for(int i=0; i<array.length; i++) array[i]=result/array[i];

        return array;

    }

}
