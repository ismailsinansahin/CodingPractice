package LeetCodeQuestions.TopInterviewQuestions.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class $227_BasicCalculatorII {

    public static void main(String[] args) {

//        System.out.println("calculate(\"2+3*5\") = " + calculate("2+3*5"));
//        System.out.println("calculate(\"3/2\") = " + calculate("3/2"));
//        System.out.println("calculate(\"3+5/2\") = " + calculate("3+5/2"));
//        System.out.println("calculate(\"0-3\") = " + calculate("0-3"));
//        System.out.println("calculate(\"2/0\") = " + calculate("2/0"));
//        System.out.println("calculate(\"2+45*2/3-20*2\") = " + calculate("2+45*2/3-20*2"));
//        System.out.println("calculate(\"3*2\") = " + calculate("3*2"));
//        System.out.println("calculate(\"322 + 48 / 2 * 2\") = " + calculate("322+48/2*2"));
        System.out.println("calculate(\"1-1+1\") = " + calculate("1-1+1"));

    }

    public static int calculate(String s){

        if (s == null || s.isEmpty()) return 0;

        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int currentNumber = 0;
        char operation = '+';

        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            // calculate the number if more than one digit
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }

            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
                if (operation == '-') stack.push(-currentNumber);
                else if (operation == '+') stack.push(currentNumber);
                else if (operation == '*') stack.push(stack.pop() * currentNumber);
                else if (operation == '/') stack.push(stack.pop() / currentNumber);
                operation = currentChar;
                currentNumber = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) result += stack.pop();
        return result;

    }

//    public static int calculate1(String s){
//
//        int result = 0;
//        Stack<Character> multiplicationDivisionStack = new Stack<>();
//        Stack<Character> additionSubtractionStack = new Stack<>();
//        int number1 = 0;
//        int number2 = 0;
//
//        for (int i=0; i<s.length(); i++) {
//            if(s.charAt(i) != '*' && s.charAt(i) != '/') multiplicationDivisionStack.add(s.charAt(i));
//            else if(s.charAt(i) == '*' || s.charAt(i) == '/'){
//                number1 = getNumberFromMultiplicationDivisionStack(multiplicationDivisionStack);
//                number2 = getNumberFromString(s, i+1);
//                int multiplicationDivisionResult = 0;
//                if(s.charAt(i) == '*') multiplicationDivisionResult = multiply(number1, number2);
//                else multiplicationDivisionResult = divide(number1, number2);
//                if(multiplicationDivisionStack.isEmpty()) {
//                    result = multiplicationDivisionResult;
//                    break;
//                }
//                putResultToMultiplicationDivisionStack(multiplicationDivisionStack, multiplicationDivisionResult);
//                i = i + getNumber2Digits(number2);
//            }
//        }
//
//        while(!multiplicationDivisionStack.isEmpty()){
//            additionSubtractionStack.push(multiplicationDivisionStack.pop());
//        }
//
//        while(!additionSubtractionStack.isEmpty()) {
//            number1 = getNumberFromAdditionSubtractionStack(additionSubtractionStack);
//            char operator = getOperatorFromStack(additionSubtractionStack);
//            number2 = getNumberFromAdditionSubtractionStack(additionSubtractionStack);
//            int additionSubtractionResult = 0;
//            if(operator == '+') additionSubtractionResult = add(number1, number2);
//            else additionSubtractionResult = subtract(number1, number2);
//            if(additionSubtractionStack.isEmpty()) {
//                result = additionSubtractionResult;
//                break;
//            }
//            putResultToAdditionSubtractionStack(additionSubtractionStack, additionSubtractionResult);
//        }
//
//        return result;
//
//    }
//
//    public static int getNumberFromMultiplicationDivisionStack(Stack<Character> stack){
//        String stringNumber = "";
//        while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
//            stringNumber = stack.pop() + stringNumber;
//        }
//        return Integer.parseInt(stringNumber);
//    }
//
//    public static int getNumberFromAdditionSubtractionStack(Stack<Character> stack){
//        String stringNumber = "";
//        while(!stack.isEmpty() && Character.isDigit(stack.peek())) {
//            stringNumber = stringNumber + stack.pop();
//        }
//        return Integer.parseInt(stringNumber);
//    }
//
//    public static int getNumberFromString(String s, int i){
//        String stringNumber = "";
//        while(i<s.length() && Character.isDigit(s.charAt(i))) {
//            stringNumber += s.charAt(i);
//            i++;
//        }
//        return Integer.parseInt(stringNumber);
//    }
//
//    public static char getOperatorFromStack(Stack<Character> stack){
//        return stack.pop();
//    }
//
//    public static void putResultToMultiplicationDivisionStack(Stack<Character> stack, int result){
//        String str = Integer.toString(result);
//        for(int i=0 ; i<str.length() ; i++){
//            stack.push(str.charAt(i));
//        }
//    }
//
//    public static void putResultToAdditionSubtractionStack(Stack<Character> stack, int result){
//        String str = Integer.toString(result);
//        for(int i=str.length()-1 ; i>=0 ; i--){
//            stack.push(str.charAt(i));
//        }
//    }
//
//    public static int getNumber2Digits(int number2){
//        int digits = 0;
//        while(number2 > 0){
//            digits++;
//            number2 = number2 / 10;
//        }
//        return digits;
//    }
//
//    public static int add(int number1, int number2){
//        return number1 + number2;
//    }
//
//    public static int subtract(int number1, int number2){
//        return number1 - number2;
//    }
//
//    public static int multiply(int number1, int number2){
//        return number1 * number2;
//    }
//
//    public static int divide(int number1, int number2){
//        return number1 / number2;
//    }

}
