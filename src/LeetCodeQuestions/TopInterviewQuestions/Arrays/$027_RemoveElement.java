package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $027_RemoveElement {

    public static void main(String[] args) {
        int[] numbers = {2,0,1,2,2,3,0,4,2,2};
//        int[] numbers = {0,1,2,2,3,0,4,2};
//        int[] numbers = {3,2,2,3};
        int value = 2;
        int k = removeElement(numbers, value);
        System.out.println("k= " + k + " " + Arrays.toString(numbers));
    }

    static int removeElement(int[] numbers, int value){
        int current = 0;
        int write = 0;
        boolean isFound = false;
        while(current < numbers.length){
            if(numbers[current] == value) isFound = true;
            else{
                if(isFound) numbers[write] = numbers[current];
                write++;
            }
            current++;
        }
        return write;
    }

}
