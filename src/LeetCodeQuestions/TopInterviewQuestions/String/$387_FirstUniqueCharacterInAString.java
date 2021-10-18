package LeetCodeQuestions.TopInterviewQuestions.String;

public class $387_FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        String s = "leetcode";
//        String s = "loveleetcode";
        System.out.println("Input  : " + s);
        System.out.println("Output : " + firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int counter = 0;
        for (int i=0 ; i<s.length() ; i++){
            counter=0;
            for (int j=0 ; j<s.length() ; j++){
                if ((i!=j) && (s.charAt(i)==s.charAt(j))) {
                    counter++;
                    break;
                }
            }
            if (counter==0) return i;
        }
        return -1;
    }

}
