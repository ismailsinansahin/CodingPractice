package LeetCodeQuestions.TopInterviewQuestions.Stacks;

import java.util.Stack;

public class $394_DecodeString {

    public static void main(String[] args) {

//        System.out.println("decodeString(\"3[a]2[bc]\") = " + decodeString("3[a]2[bc]"));
//        System.out.println("decodeString(\"3[a2[c]]\") = " + decodeString("3[a2[ccc]]"));
//        System.out.println("decodeString(\"2[abc]3[cd]ef\") = " + decodeString("2[abc]3[cd]ef"));
//        System.out.println("decodeString(\"abc3[cd]xyz\") = " + decodeString("abc3[cd]xyz"));
//        System.out.println("decodeString(\"100[leetcode]\") = " + decodeString("100[leetcode]"));
        System.out.println("decodeString(\"3[z]2[2[y]pq4[2[jk]e1[f]]]ef\") = " + decodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef"));

    }


//    3[z]  2[   2[y]  pq  4[2[jk]       e 1[f]  ]  ]        ef


    public static String decodeString(String s){

        //Creating and printing input stack
        Stack<Character> inputStack = new Stack<>();
        for (int i=0 ; i<s.length() ; i++){
            inputStack.add(s.charAt(i));
        }
        System.out.println(inputStack);

        //Creating variables
        Stack<String> outputStack = new Stack<>();
        String text1 = "";
        String text2 = "";
        String text = "";
        String times = "";
        int counter = 0;

        while(!inputStack.isEmpty()){

            while(inputStack.peek() == ']') { //getting deep
                inputStack.pop();
                counter++;
            }

            if(counter == 0) outputStack.add(inputStack.pop().toString()); //if no deep, add top element to output stack

            else{

                while(!inputStack.isEmpty() && Character.isAlphabetic(inputStack.peek())) { //getting text
                    text1 = inputStack.pop() + text1;
                }
                inputStack.pop();
                counter--;
                while(!inputStack.isEmpty() && Character.isDigit(inputStack.peek())) { //getting times
                    times = inputStack.pop() + times;
                }
                int timess = Integer.parseInt(times);
                while(timess > 0){
                    text2 += text1;
                    timess--;
                }
                times = "";
                text1 = ""; //create first text with text and times



                if(inputStack.isEmpty()){ //if empty put the text2 to output stack
                    outputStack.add(text2);
                    break;
                }
                else if(!inputStack.isEmpty() && inputStack.peek() == ']') { //if new text begins, put the text2 to output stack
                    outputStack.add(text2);
                    text2 = "";
                    times = "";
                }
                else{ //there is no times after this text, so new char will be added in front of the text2
                    while(!inputStack.isEmpty() && Character.isAlphabetic(inputStack.peek())) {
                        text2 = inputStack.pop() + text2;
                    }
                    if(inputStack.isEmpty()){
                        outputStack.add(text2);
                        break;
                    }
                    else{
                        inputStack.pop();
                        counter--;
                        while(!inputStack.isEmpty() && Character.isDigit(inputStack.peek())) {
                            times = "";
                            times = Integer.parseInt(inputStack.pop().toString()) + times;
                            timess = Integer.parseInt(times);
                            while (timess > 0){
                                outputStack.add(text2);
                                timess--;
                            }
                            times = "";
                        }

                    }

                }

            }

        }

        text = "";
        while(!outputStack.isEmpty()){
            text += outputStack.pop();
        }

        return text;

    }

}