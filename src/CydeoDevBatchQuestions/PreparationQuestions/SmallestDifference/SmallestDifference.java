package CydeoDevBatchQuestions.PreparationQuestions.SmallestDifference;

import java.util.*;

public class SmallestDifference {

    public static int[] smallestDifferenceWithMap(int[] array1, int[] array2){

        int[] output = new int[2];
        Map<Integer, Integer> allNumbersMap = new TreeMap<>();
        int difference = Integer.MAX_VALUE;

        for(int i : array1) allNumbersMap.put(i,1);
        for(int i : array2) allNumbersMap.put(i,2);

        Object[] keysArray = allNumbersMap.keySet().toArray();

        for(int i=0 ; i<keysArray.length-1 ; i++){

            int firstElementArray = allNumbersMap.get(Integer.valueOf(keysArray[i].toString()));
            int secondElementArray = allNumbersMap.get(Integer.valueOf(keysArray[i+1].toString()));
            int firstElement = Integer.parseInt(keysArray[i].toString());
            int secondElement = Integer.parseInt(keysArray[i+1].toString());

            if(firstElementArray != secondElementArray){
                if (secondElement - firstElement < difference){
                    difference = secondElement - firstElement;
                    output[0] = firstElement;
                    output[1] = secondElement;
                }
            }
        }
        return output;
    }

    public static int[] smallestDifference(int[] array1, int[] array2){
        int[] output = new int[2];
        Arrays.sort(array1);
        Arrays.sort(array2);
        int minDifference = Integer.MAX_VALUE;
        int current1 = 0;
        int current2 = 0;
        while (!((current1 == array1.length-1) && (current2 == array2.length-1))){
            int currentDifference = Math.abs(array1[current1] - array2[current2]);
            if(currentDifference < minDifference) {
                minDifference = currentDifference;
                output[0] = array1[current1];
                output[1] = array2[current2];
            }
            if(current1 == array1.length-1) current2++;
            else if (current2 == array2.length-1) current1++;
            else if(array1[current1] < array2[current2]) current1++;
            else if(array2[current2] <= array1[current1]) current2++;
        }
        return output;
    }

    public static int[] smallestDifferenceBruteForce(int[] array1, int[] array2){
        int[] output = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i : array1) {
            for (int j : array2) {
                if (Math.abs(i - j) < min) {
                    min = Math.abs(i - j);
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }

}
