package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.Arrays;

public class $344_ReverseString {

    public static void main(String[] args) {
//        char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};
        System.out.println("Input  : " + Arrays.toString(s));
        reverseString(s);
        System.out.println("Output : " + Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i=0 ; i<s.length/2 ; i++){
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }

}
