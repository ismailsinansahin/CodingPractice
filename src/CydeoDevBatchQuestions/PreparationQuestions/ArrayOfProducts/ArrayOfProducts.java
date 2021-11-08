package CydeoDevBatchQuestions.PreparationQuestions.ArrayOfProducts;

public class ArrayOfProducts {

    public static int[] getArrayOfProducts1(int[] array) {
        int[] products = new int[array.length];
        int leftRunningProduct = 1;
        for (int i = 0; i < array.length; i++) {
            products[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }
        int rightRunningProduct = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            products[i] *= rightRunningProduct;
            rightRunningProduct *= array[i];
        }
        return products;
    }

    public static int[] getArrayOfProducts2(int[] array){
        var result = 1;
        for(int each : array) result *= each;
        for(int i=0; i<array.length; i++) array[i]=result/array[i];
        return array;
    }

}
