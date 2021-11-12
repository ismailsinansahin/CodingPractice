package CydeoDevBatchQuestions.PreparationQuestions.ReverseWordsInString;

import java.util.Stack;

public class ReverseWordsInString {

    public static String reverseWordsInString(String text) {
        String tempWord = "";
        String reversedText = "";
        int index = 0;
        while (index < text.length() - 1) {
            char c1 = text.charAt(index);
            char c2 = text.charAt(index + 1);
            if (isSeries(c1, c2)) {
                tempWord += c1;
            } else {
                tempWord += c1;
                reversedText = tempWord + reversedText;
                tempWord = "";
            }
            index++;
        }
        char c1 = text.charAt(text.length() - 2);
        char c2 = text.charAt(text.length() - 1);
        if (isSeries(c1, c2)) {
            tempWord += text.charAt(text.length() - 1);
        } else {
            reversedText = tempWord + reversedText;
            tempWord = text.charAt(text.length() - 1) + "";
        }
        reversedText = tempWord + reversedText;
        return reversedText;
    }

    public static String reverseWordsInStringWithStack(String text){
        Stack<String> tempStack = new Stack<>();
        String tempWord = "";
        String reversedText = "";
        int index = 0;
        while(index < text.length()-1){

            char c1 = text.charAt(index);
            char c2 = text.charAt(index+1);

            if(isSeries(c1,c2)){
                tempWord += c1;
            }else{
                tempWord += c1;
                tempStack.add(tempWord);
                tempWord = "";
            }
            index++;
        }
        char c1 = text.charAt(text.length()-2);
        char c2 = text.charAt(text.length()-1);
        if(isSeries(c1,c2)){
            tempWord += text.charAt(text.length()-1);
        }
        else{
            tempStack.add(tempWord);
            tempWord = text.charAt(text.length()-1) + "";
        }
        tempStack.add(tempWord);
        while(tempStack.iterator().hasNext()) {
            reversedText += tempStack.pop();
        }
        return reversedText;
    }

    public static boolean isSeries(char c1, char c2){
        return Character.isWhitespace(c1) == Character.isWhitespace(c2);
    }

}
