package LeetCodeQuestions.TopInterviewQuestions.String;

public class $005_LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("abcda"));
    }

    public static String longestPalindromicSubstring(String s){
        int begin = 0;
        int end = s.length()-1;
        int left = 0;
        int right = 0;
        String longest = "";
        String temp = s.charAt(0) + "";
        longest = temp;
        if(s.length() == 1) longest = temp;
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)) longest = temp + s.charAt(1);
            else longest = temp;
        }
        for(int i=1 ; i<s.length()-1 ; i++){
            temp = "";
            left = i - 1;
            right = i + 1;
            if(s.charAt(0) == s.charAt(1)) temp += "" + s.charAt(0) + s.charAt(1);
            if(s.charAt(i) == s.charAt(i+1)){
                if((i == 1) && (s.charAt(0) == s.charAt(1))) {
                    temp = "" + s.charAt(0) + s.charAt(1);
                }
                else temp = "" + s.charAt(i);
                while((right <= end) && (s.charAt(i) == s.charAt(right))){
                    temp += s.charAt(right);
                    right++;
                }
                while((left >= begin) && (right <= end) && (s.charAt(left) == s.charAt(right))){
                    temp = s.charAt(left) + temp + s.charAt(right);
                    left--;
                    right++;
                }
            }
            if((left >= begin) && (right <= end) && (s.charAt(left) == s.charAt(right))){
                temp = "" + s.charAt(i);
                while((left >= begin) && (right <= end) && (s.charAt(left) == s.charAt(right))){
                    temp = s.charAt(left) + temp + s.charAt(right);
                    left--;
                    right++;
                }
            }
            if (temp.length() > longest.length()) longest = temp;
        }
        return longest;
    }

}