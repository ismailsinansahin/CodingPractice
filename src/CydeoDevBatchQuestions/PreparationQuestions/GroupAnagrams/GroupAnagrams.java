package CydeoDevBatchQuestions.PreparationQuestions.GroupAnagrams;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
        for (String word : words) {

            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            anagrams.putIfAbsent(sortedWord, new ArrayList<String>());
            anagrams.get(sortedWord).add(word);
        }
        return new ArrayList<>(anagrams.values());
    }

}