package CrackingTheCodingInterview.ArraysAndStrings.CheckPermutation;

import CrackingTheCodingInterview.ArraysAndStrings.IsUnique.IsUnique;

public class Main {

    public static void main(String[] args) {

        String text1 = "İinAs";
        String text2 = "iİsan";
        System.out.println(CheckPermutation.checkPermutation1(text1, text2));
        System.out.println(CheckPermutation.checkPermutation2(text1, text2));

    }

}
