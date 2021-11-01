package CydeoDevBatchQuestions.PreparationQuestions.GroupAnagrams;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

       String[] words = {"yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp"};
       groupAnagrams(words);

    }

    private static List<List<String>> groupAnagrams(String[] words) {

        List<List<String>> anagrams = new ArrayList<>();

//        for(String each : words){
//            if each.
//        }




        return  anagrams;

    }

    private static boolean checkFrequency(String word1, String word2){

        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> frequencyMap = new HashMap<>();
//
//        for(int i=0 ; i<word1.length() ; i++){
//            if(frequencyMap.containsKey(word1.charAt(i))){
//                frequencyMap. = frequencyMap.get(word1.charAt(i))+1;
//                        word1.charAt(i)
//            }
//        }

        return true;

    }

}
