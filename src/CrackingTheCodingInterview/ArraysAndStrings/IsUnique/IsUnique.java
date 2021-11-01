package CrackingTheCodingInterview.ArraysAndStrings.IsUnique;

import java.util.Arrays;

public class IsUnique {

    //Brute Force - Time complexity O(n2)
    public static boolean isUnique1(String text){
        for(int i=0 ; i<text.length() ; i++) {
            for (int j = i+1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) return false;
            }
        }
        return true;
    }

    //Sorting - Time complexity O(n log n)
    public static boolean isUnique2(String text){
        char[] charArray = text.toCharArray();
        Arrays.sort(charArray);
        for(int i=0 ; i< charArray.length-1 ; i++) {
            if(charArray[i]==charArray[i+1]) return false;
        }
        return true;
    }

    //Boolean array for all characters - Time Complexity O(n)
    public static boolean isUnique3(String text){
        if(text.length()>128) return false;
        boolean[] charSet = new boolean[128];
        for(int i=0 ; i<text.length() ; i++){
            System.out.println("text.charAt(i) = " + text.charAt(i));
            System.out.println("charSet[text.charAt(i)] = " + charSet[text.charAt(i)]);
            if(charSet[text.charAt(i)]) return false;
            charSet[text.charAt(i)] = true;
        }
        return true;
    }

}
