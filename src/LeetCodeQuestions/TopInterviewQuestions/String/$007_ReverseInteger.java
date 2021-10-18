package LeetCodeQuestions.TopInterviewQuestions.String;

public class $007_ReverseInteger {

    public static void main(String[] args) {
//        int x = 123000;
//        int x = 120;
        int x = 1534236469;
        System.out.println("Input  : " + x);
        System.out.println("Output : " + reverse(x));
    }

    public static int reverse(int x) {
        long reversed=0;
        int remaining=0;
        boolean flag=true;
        if (x<0) {
            x=-x;
            flag=false;
        }
        while(x>0){
            remaining = x%10;
            x=x/10;
            reversed = (reversed*10)+remaining;
        }
        if (reversed > 2147483647) return 0;
        return (!flag) ? (int)-reversed : (int)reversed;
    }

}
