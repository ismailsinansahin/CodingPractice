package LeetCodeQuestions.TopInterviewQuestions.Math;

public class $2014_CountPrimes {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Input  : " + n);
        System.out.println("Output : " + countPrimes(n));
    }

    public static int countPrimes(int n){
        int counter = 1;
        if (n<=2) return 0;
        for (int i=2 ; i<n ; i++){
            if(isPrime(i)) counter++;
        }
        return counter;
    }

    public static boolean isPrime(int num){
        if (num%2 == 0) return false;
        else {
            for (int i=3 ; i<Math.sqrt(num) ; i++){
                if (num%i == 0) return false;
            }
        System.out.println(num);
        return true;
        }
    }

}

