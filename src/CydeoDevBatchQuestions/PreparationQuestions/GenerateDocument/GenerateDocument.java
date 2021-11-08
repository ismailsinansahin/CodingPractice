package CydeoDevBatchQuestions.PreparationQuestions.GenerateDocument;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GenerateDocument {

    public static boolean canGenerate(String document, String characters) {
        //StringBuilder chars = new StringBuilder(characters);
        if (characters.length()<document.length()) return false;
        boolean isFound = false;
        for(int i=0 ; i< document.length() ; i++){
            isFound = false;
            for(int j=0 ; j<characters.length() ; j++){
                if(document.charAt(i)==characters.charAt(j)){
                    characters.replaceFirst(String.valueOf(characters.charAt(i)), "");
                    isFound = true;
                    break;
                }
            }
            if (!isFound) return false;
        }
        return true;
    }

    public static boolean generateDocumentBruteForce(String ch, String doc) {
        for (int idx = 0; idx < doc.length(); idx++) {
            char character = doc.charAt(idx);
            int documentFrequency = countCharacterFrequency(character, doc);
            int charactersFrequency = countCharacterFrequency(character, ch);
            if (documentFrequency > charactersFrequency) {
                return false;
            }
        }
        return true;
    }
    public static int countCharacterFrequency(char character, String target) {
        int frequency = 0;
        for (int idx = 0; idx < target.length(); idx++) {
            char c = target.charAt(idx);
            if (c == character) {
                frequency += 1;
            }
        }
        return frequency;
    }

    // O(c * (n + m)) time | O(c) space - where n is the number of characters,
    // the length of the document, and c is the number of unique characters in
    // document
    public static boolean generateDocumentSolution2(String characters, String document) {
        Set<Character> alreadyCounted = new HashSet<Character>();
        for (int idx = 0; idx < document.length(); idx++) {
            char character = document.charAt(idx);
            if (alreadyCounted.contains(character)) {
                continue;
            }
            int documentFrequency = countCharacterFrequency(character, document);
            int charactersFrequency = countCharacterFrequency(character, characters);
            if (documentFrequency > charactersFrequency) {
                return false;
            }
            alreadyCounted.add(character);
        }
        return true;
    }

    public static boolean generateDocumentOptimal(String characters, String document) {
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();
        for (int idx = 0; idx < characters.length(); idx++) {
            char character = characters.charAt(idx);
            characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
        }
        for (int idx = 0; idx < document.length(); idx++) {
            char character = document.charAt(idx);
            if (!characterCounts.containsKey(character) || characterCounts.get(character) ==0) {
                return false;
            }
            characterCounts.put(character, characterCounts.get(character) - 1);
        }
        return true;
    }

}
