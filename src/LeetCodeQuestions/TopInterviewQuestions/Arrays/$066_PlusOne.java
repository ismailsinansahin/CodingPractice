package LeetCodeQuestions.TopInterviewQuestions.Arrays;

import java.util.Arrays;

public class $066_PlusOne {

    public static void main(String[] args) {
//        int[] digits = {1,2,3,9,9};
//        int[] digits = {4,3,2,1};
        int[] digits = {9,9};
//        int[] digits = {9,8,7,6,5,4,3,2,9,9};
//        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println("Input  : " + Arrays.toString(digits));
        System.out.println("Output : " + Arrays.toString(plusOne(digits)));
    }

//    public static int[] plusOne(int[] digits){
//        String stringDigits = "";
//        for (int each : digits) {
//            stringDigits+=each;
//        }
//        BigDecimal newNumber = new BigDecimal(stringDigits);
//        newNumber = newNumber.add(new BigDecimal(1));
//        String newString = String.valueOf(newNumber);
//        int[] newDigits = new int[newString.length()];
//        for(int i=0 ; i<newDigits.length ; i++){
//            newDigits[i] = Integer.parseInt(String.valueOf(newString.charAt(i)));
//        }
//        return newDigits;
//    }

    public static int[] plusOne(int[] digits){
        for (int i=digits.length-1 ; i>=0 ; i--){
            if (digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }else{
                digits[i]=0;
            }
        }
        int[] ifAllNine = new int[digits.length+1];
        ifAllNine[0]=1;
        return ifAllNine;
    }

}
