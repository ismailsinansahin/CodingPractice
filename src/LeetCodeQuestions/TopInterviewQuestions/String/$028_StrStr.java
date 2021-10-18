package LeetCodeQuestions.TopInterviewQuestions.String;

public class $028_StrStr {

    public static void main(String[] args) {
//        String haystack = "hello";
//        String needle = "ll";
//        String haystack = "aaaaa";
//        String needle = "baa";
//        String haystack = "";
//        String needle = "";
        String haystack = "mississippi";
        String needle = "issip";
//        String haystack = "mississippi";
//        String needle = "issipi";
//        String haystack = "a";
//        String needle = "a";
        System.out.println("Input  haystack: " + haystack + " , needle: " + needle);
        System.out.println("Output : " + strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle){
        if(needle.equals("")) return 0;
        if(needle.length()>haystack.length()) return -1;
        for(int i=0 ; i<needle.length() ; i++){
            for(int j=0 ; j<(haystack.length()-needle.length())+1 ; j++){
                label : if (needle.charAt(i)==haystack.charAt(j)) {
                    for (int k=1 ; k<needle.length() ; k++) {
                        if (!(needle.charAt(i + k) == haystack.charAt(j + k))) break label;
                    }
                    return j;
                }
            }
            return -1;
        }
        return -1;
    }
}
