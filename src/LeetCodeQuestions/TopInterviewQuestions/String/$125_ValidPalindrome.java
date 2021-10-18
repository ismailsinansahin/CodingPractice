package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.ArrayList;
import java.util.List;

public class $125_ValidPalindrome {

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = "0z";
//        String s = ".,";
        String s = "a.";
        System.out.println("Input  : " + s);
        System.out.println("Output : " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        List<Character> text = toValidString(s);
        if(text.size()==0) return true;
        System.out.println("text.toString() = " + text.toString());
        int left=0;
        int right=text.size()-1;
        boolean flag = true;
        char c1 = text.get(left);
        char c2 = text.get(right);
        while(left<=right-1){
            if(c1==c2){
                c1=text.get(++left);
                c2=text.get(--right);
            }else {
                return false;
            }
        }
        return true;
    }

    public static List<Character> toValidString (String s){
        s=s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for(int i=0 ; i<s.length() ; i++) {
            if (isCharValid(s.charAt(i))) list.add(s.charAt(i));
        }
        System.out.println("list.toString() = " + list.toString());
        return list;
    }

    public static boolean isCharValid(Character c){
        return (Character.isAlphabetic(c) || Character.isDigit(c));
    }

//    public static boolean isPalindrome(String s){
//        s=s.toLowerCase();
//        Stack<Character> stackFirst = new Stack<>();
//        Stack<Character> stackReversed = new Stack<>();
//        Stack<Character> stackTemp = new Stack<>();
//        Queue<Character> queueTemp1 = new LinkedList<>();
//        Queue<Character> queueTemp2 = new LinkedList<>();
//        for(int i=0 ; i<s.length() ; i++){
//            System.out.println("s.charAt(i) = " + s.charAt(i));
//            if((Character.isAlphabetic(s.charAt(i))) || (Character.isDigit(s.charAt(i)))) queueTemp1.add(s.charAt(i));
//        }
//        System.out.println("queueTemp1 = " + queueTemp1);
//        for(int i=0 ; i<s.length() ; i++){
//            if((Character.isAlphabetic(s.charAt(i))) || (Character.isDigit(s.charAt(i))))  queueTemp2.add(s.charAt(i));
//        }
//        System.out.println("queueTemp2 = " + queueTemp2);
//        while(!queueTemp1.isEmpty()){
//            stackFirst.push(queueTemp1.remove());
//        }
//        while(!queueTemp2.isEmpty()){
//            stackTemp.push(queueTemp2.remove());
//        }
//        while(!stackTemp.isEmpty()){
//            stackReversed.push(stackTemp.pop());
//        }
//        System.out.println("stackFirst    = " + stackFirst);
//        System.out.println("stackReversed = " + stackReversed);
//        while(!stackFirst.isEmpty())
//            if(stackFirst.pop()!=stackReversed.pop()){
//                return false;
//        }
//        return true;
//    }

}
