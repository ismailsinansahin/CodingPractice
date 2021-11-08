package CydeoDevBatchQuestions.PreparationQuestions.TwoNumberSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int totalSum){
        int[] result = new int[2];
        Arrays.sort(array);
        int head = 0 ;
        int tail = array.length-1;
        while(head<tail){
            int totalTwo = array[head] + array[tail];
            if(totalTwo == totalSum) return new int[] {array[head], array[tail]};
            if(totalTwo < totalSum) head++;
            if(totalTwo > totalSum) tail--;
        }
        return new int[0];
    }

    public static int[] findThePair(int[] arr,int target){
        int i=0,j=arr.length-1;
        Arrays.sort(arr);  // nlog(n)
        while(i<j){  //n
            if(arr[i] + arr[j] == target) return new int[]{arr[i],arr[j]};
            else if(arr[i] + arr[j] < target) i++;
            else j--;
        }
        return new int[0];
    }

    public static int[] findThePair2(int[] arr,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< arr.length;i++){   //o(n)
            if(map.containsKey(arr[i])) return new int[] {arr[i],map.get(arr[i])};
            else map.put(target-arr[i],arr[i]);
        }
        return new int[0];
    }

}
