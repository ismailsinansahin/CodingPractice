package LeetCodeQuestions.TopInterviewQuestions.String;

import java.util.Arrays;

public class $014_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"floweraaaa","flowaaaa","flightaaaa","flankaaaa"};
//        String[] strs = {"a"};
//        String[] strs = {};
        System.out.println("Input  : " + Arrays.toString(strs));
        System.out.println("Output : " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs){
        String s = "";
        int firstWord = 0;
        int shortestWord = getShortestWordLength(strs);;
        if (strs.length==1) return strs[0];
        for (int j=0 ; j<shortestWord ; j++){
            label : if(strs[firstWord].charAt(j) != strs[firstWord+1].charAt(j)){
                break;
            }else{
                int k=2;
                while (k<strs.length){
                    if(strs[firstWord].charAt(j)!=strs[k].charAt(j)) {
                        break label;
                    }else {
                        k++;
                    }
                }
                s += strs[firstWord].charAt(j);
                }
            }
        return s;
    }

    public static int getShortestWordLength(String[] strs){
        int minLength = strs[0].length();
        for (int i=0 ; i<strs.length-1 ; i++){
            if(strs[i+1].length() < minLength){
                minLength = strs[i+1].length();
            }
        }
        return minLength;
    }

}
