package CydeoDevBatchQuestions.PreparationQuestions.LongestSubstringWODuplication;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWODuplication {

    public static String longestSubstringWODuplication(String string){
        String longestSubstring = "";
        String tempSubstring = "";
        Map<Character, Integer> characterMap = new HashMap<>();
        int i = 0;
        while((i < string.length())){
            if(!characterMap.containsKey(string.charAt(i))){
                characterMap.put(string.charAt(i), i);
                tempSubstring += string.charAt(i);
                i++;
            }
            else{
                if(tempSubstring.length() > longestSubstring.length()) longestSubstring = tempSubstring;
                i = characterMap.get(string.charAt(i)) + 1;
                if((string.length() - i) < (longestSubstring.length())) break;
                tempSubstring = "";
                characterMap.clear();
            }
        }
        if(tempSubstring.length() > longestSubstring.length()) longestSubstring = tempSubstring;
        return longestSubstring;
    }

}
