package CydeoDevBatchQuestions.PreparationQuestions.LongestPeak;

public class LongestPeak {

    public static int longestPeak(int[] array){

        int tempLength = 1;
        int max = 0;
        int i = 0;

        boolean possiblePeak = false;
        boolean peak = false;

        while(i < array.length-1){

            boolean climbing = array[i+1] > array[i];
            boolean descending = array[i+1] < array[i];

            if(climbing) {
                if(!possiblePeak && !peak){  //beginning or after plato
                    possiblePeak = true;
                    tempLength++;
                }
                else if(possiblePeak && !peak) tempLength++; //in the climbing
                else if(!possiblePeak && peak){  //starting new climbing from the deep after a peak
                    if(tempLength > max)  max = tempLength;
                    tempLength = 1;
                    peak = false;
                    possiblePeak = true;
                    tempLength++;
                }
            }

            else if(descending){
                if(possiblePeak){ //starting new descending from the peak after climbing
                    possiblePeak = false;
                    peak = true;
                    tempLength++;
                }
                else if(peak) tempLength++; //in the descending
            }

            else{ //plato
                if(possiblePeak) {  //plato while climbing
                    possiblePeak = false;
                    tempLength = 1;
                }
                else if(peak){  //plato while descending after a peak
                    if(tempLength > max)  max = tempLength;
                    tempLength = 1;
                    peak = false;
                    possiblePeak = true;
                    tempLength++;
                }
            }

            i++;

        }

        if(tempLength > max)  max = tempLength;
        if(tempLength == 1) max = 0;
        return max;

    }

}
