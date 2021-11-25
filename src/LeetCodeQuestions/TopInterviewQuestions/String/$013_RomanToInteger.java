package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.HashMap;
import java.util.Map;

public class $013_RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCVI"));
    }

    public static int romanToInt(String s){
        int number = 0;
        boolean isLast = false;
        for (int i=0 ; i < s.length()-1 ; i++){
            char character = s.charAt(i);
            switch(character){
                case 'I':
                    if(s.charAt(i+1) == 'V'){number += 4; i++; if(i==s.length()-1) isLast = true;}
                    else if(s.charAt(i+1) == 'X'){number += 9; i++; if(i==s.length()-1) isLast = true;}
                    else number += 1; break;
                case 'V': number += 5; break;
                case 'X':
                    if(s.charAt(i+1) == 'L'){number += 40; i++; if(i==s.length()-1) isLast = true;}
                    else if(s.charAt(i+1) == 'C'){number += 90; i++; if(i==s.length()-1) isLast = true;}
                    else number += 10; break;
                case 'L':number += 50; break;
                case 'C':
                    if(s.charAt(i+1) == 'D'){number += 400; i++; if(i==s.length()-1) isLast = true;}
                    else if(s.charAt(i+1) == 'M'){number += 900; i++; if(i==s.length()-1) isLast = true;}
                    else number += 100; break;
                case 'D': number += 500; break;
                case 'M': number += 1000; break;
            }
        }
        if(isLast) return number;
        else{
            switch(s.charAt(s.length()-1)){
                case 'I': number += 1; break;
                case 'V': number += 5; break;
                case 'X': number += 10; break;
                case 'L': number += 50; break;
                case 'C': number += 100; break;
                case 'D': number += 500; break;
                case 'M': number += 1000; break;
            }
        }
        return number;
    }
}
