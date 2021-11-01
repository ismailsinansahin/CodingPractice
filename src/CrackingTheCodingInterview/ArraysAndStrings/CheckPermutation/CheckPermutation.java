package CrackingTheCodingInterview.ArraysAndStrings.CheckPermutation;

import java.util.Arrays;
import java.util.HashMap;

public class CheckPermutation {

    //Brute Force - Time complexity O(n2)
    public static boolean checkPermutation1(String text1, String text2){
        boolean flag;
        for(int i=0; i<text1.length(); i++){
            flag=false;
            for(int j=0; j<text2.length(); j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    text2 = text2.replaceFirst(String.valueOf(text1.charAt(i)),"");
                    flag=true;
                    break;
                }
            }
            if(!flag) return false;
        }
        return true;
    }

    //Arrays Sort - Time complexity O(n log n)
    public static boolean checkPermutation2(String text1, String text2){
        if(text1.length()!=text2.length()) return false;
        char[] chars1 = text1.toCharArray();
        char[] chars2 = text2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

    //Hash Map - Time complexity O(n)
    public static boolean checkPermutation3(String text1, String text2) {
        HashMap<Character, Integer> characterCounter = new HashMap<Character, Integer>();
        for (int i=0; i<text1.length(); i++) {
            char character = text1.charAt(i);
            characterCounter.put(character, characterCounter.getOrDefault(character, 0) + 1);
        }
        for (int i=0; i<text2.length(); i++) {
            char character = text2.charAt(i);
            if (!characterCounter.containsKey(character) || characterCounter.get(character) == 0) {
                return false;
            }
            characterCounter.put(character, characterCounter.get(character) - 1);
        }
        return true;
    }

}
