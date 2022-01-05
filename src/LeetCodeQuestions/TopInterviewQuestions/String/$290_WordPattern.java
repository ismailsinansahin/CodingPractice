package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $290_WordPattern {

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println("wordPattern(pattern,s) = " + wordPattern(pattern, s));
    }

    static boolean wordPattern(String pattern, String s){
        List<String> wordList = Arrays.asList(s.trim().split(" "));
        Map<Character, String> wordMap = new HashMap<>();
        if(wordList.size() != pattern.length()) return false;

        for(int i=0 ; i<pattern.length() ; i++){
            if(wordMap.containsKey(pattern.charAt(i)) && !wordMap.get(pattern.charAt(i)).equals(wordList.get(i))) return false;
            else if(!wordMap.containsKey(pattern.charAt(i)) && wordMap.containsValue(wordList.get(i))) return false;
            else wordMap.put(pattern.charAt(i), wordList.get(i));
        }
        return true;
    }

}