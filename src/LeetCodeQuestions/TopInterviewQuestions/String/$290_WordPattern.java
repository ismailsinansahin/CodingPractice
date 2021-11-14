package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.Arrays;
import java.util.List;

public class $290_WordPattern {

    public static void main(String[] args) {
        String pattern = "abc";
        String s = "b c a";
        System.out.println("wordPattern(pattern,s) = " + wordPattern(pattern, s));
    }

    static boolean wordPattern(String pattern, String s){

        String output = "";
        String a = "";
        String b = "";
        List<String> wordList = Arrays.asList(s.split(" "));

        for(int i=0 ; i<pattern.length()-1 ; i++){
            if(pattern.charAt(i) == 'a') output += a + " ";
            else output += b + " ";
        }

        int indexOfA = pattern.indexOf('a');
        int indexOfB = pattern.indexOf('b');

        if (indexOfA > -1) a = wordList.get(indexOfA);
        if (indexOfB > -1) b = wordList.get(indexOfB);
        if ((indexOfA > -1 || indexOfB > -1) && a.equals(b)) return false;

        for(int i=0 ; i<pattern.length()-1 ; i++){
            if(pattern.charAt(i) == 'a') output += a + " ";
            else output += b + " ";
        }
        if(pattern.charAt(pattern.length()-1) == 'a') output += a;
        else output += b;
        System.out.println("output = " + output);

        if(output.equals(s)) return true;
        else return  false;

    }

}
