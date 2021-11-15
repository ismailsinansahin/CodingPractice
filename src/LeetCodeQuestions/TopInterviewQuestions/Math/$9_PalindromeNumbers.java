package LeetCodeQuestions.TopInterviewQuestions.Math;

public class $9_PalindromeNumbers {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1111));
    }

    static boolean isPalindrome(int x){
        int number = x;
        int reversed = 0;
        int div = 0;
        int mod= 0;
        while(number > 0){
            div = number / 10;
            mod = number % 10;
            reversed = reversed * 10 + mod;
            number = div;
        }
        return x == reversed;
    }

}
