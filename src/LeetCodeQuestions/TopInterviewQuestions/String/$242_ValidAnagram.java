package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.HashMap;
import java.util.Map;

public class $242_ValidAnagram {

    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";
        System.out.println("Input  : s = " + s + " t = " + t);
        System.out.println("Output : " + validAnagram(s,t));
    }

    public static boolean validAnagram(String s, String t){
        if (s.length()!=t.length()) return false;
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++){
            if (mapS.containsKey(s.charAt(i))){
                mapS.replace(s.charAt(i),mapS.get(s.charAt(i))+1);
            }else{
                mapS.put(s.charAt(i),1);
            }
        }
        for(int i=0 ; i<t.length() ; i++){
            if (mapT.containsKey(t.charAt(i))){
                mapT.replace(t.charAt(i),mapT.get(t.charAt(i))+1);
            }else{
                mapT.put(t.charAt(i),1);
            }
        }
        return mapS.equals(mapT);
    }

}
