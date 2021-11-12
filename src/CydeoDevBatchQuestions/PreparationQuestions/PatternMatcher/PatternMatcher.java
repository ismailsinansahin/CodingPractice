package CydeoDevBatchQuestions.PreparationQuestions.PatternMatcher;

import java.util.ArrayList;
import java.util.List;

public class PatternMatcher {

    public static String[] patternMatcher(String pattern, String string){

        List<Integer> patternNumbers = getPatternNumbers(pattern);
        int numberOfXs = getNumberOfXs(pattern);
        int numberOfYs = getNumberOfYs(pattern);
        int maxNumberOfYs = string.length() - numberOfXs;

        System.out.println("patternNumbers = " + patternNumbers);
        System.out.println("numberOfXs = " + numberOfXs);
        System.out.println("numberOfYs = " + numberOfYs);

        if(numberOfYs==0) {
            int xLength = string.length()/numberOfXs;
            String x = string.substring(0,xLength);
            return new String[]{x,""};
        }

        if(numberOfXs==0) {
            int yLength = string.length()/numberOfYs;
            String y = string.substring(0,yLength);
            return new String[]{"",y};
        }

        for (int possibleYLength=1; possibleYLength < maxNumberOfYs ; possibleYLength++) {

            int possibleXLength = getLengthOfX(string.length(), numberOfYs, numberOfXs, possibleYLength);
            if(possibleXLength == -1) continue;
            System.out.println("********************");
            System.out.println("possibleYLength = " + possibleYLength);
            System.out.println("possibleXLength = " + possibleXLength);

            String x = "";
            String y = "";
            if(pattern.charAt(0)=='x'){
                x = string.substring(0,possibleXLength);
                int indexOfY = patternNumbers.get(0) * possibleXLength;
                y = string.substring(indexOfY, indexOfY + possibleYLength);
            }else{
                y = string.substring(0,possibleYLength);
                int indexOfX = patternNumbers.get(0) * possibleYLength;
                x = string.substring(indexOfX, indexOfX + possibleXLength);
            }

            System.out.println("x = " + x);
            System.out.println("y = " + y);

            String actual = getActualString(pattern, x, y);
            System.out.println("actual = " + actual);
            if(actual.equals(string)) return new String[]{x,y};
            else continue;

        }

        return new String[0];

    }

    private static String getActualString(String pattern, String x, String y) {
        String actual = "";
        for(int i=0 ; i<pattern.length() ; i++){
            if(pattern.charAt(i)=='x') actual += x;
            if(pattern.charAt(i)=='y') actual += y;
        }
        return actual;
    }

    private static int getLengthOfX(int lengthOfString, int numberOfYs, int numberOfXs, int possibleYLength){
        return ((lengthOfString - (possibleYLength * numberOfYs)) % numberOfXs == 0) ? (lengthOfString -  (possibleYLength * numberOfYs)) / numberOfXs : -1;
    }

    static List<Integer> getPatternNumbers(String pattern){
        List<Integer> patternNumbers = new ArrayList<>();
        int counter = 1;
        int i = 0;
        if(pattern.length()==1){
            patternNumbers.add(1);
            return patternNumbers;
        }
        while(i < pattern.length()-2){
            if(pattern.charAt(i) == pattern.charAt(i+1)){
                counter++;
            }else{
                patternNumbers.add(counter);
                counter = 1;
            }
            i++;
        }
        if(pattern.charAt(pattern.length()-2) == pattern.charAt(pattern.length()-1)){
            counter++;
            patternNumbers.add(counter);
        }else{
            patternNumbers.add(counter);
            patternNumbers.add(1);
        }
        return patternNumbers;
    }

    private static int getNumberOfXs(String pattern) {
        int counter = 0;
        for(int i=0 ; i<pattern.length() ; i++){
            if(pattern.charAt(i)=='x') counter++;
        }
        return counter;
    }

    private static int getNumberOfYs(String pattern) {
        int counter = 0;
        for(int i=0 ; i<pattern.length() ; i++){
            if(pattern.charAt(i)=='y') counter++;
        }
        return counter;
    }

}
