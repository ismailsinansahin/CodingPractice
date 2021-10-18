package LeetCodeQuestions.TopInterviewQuestions.Arrays;

public class $122_BestTimeToBuyAndSellStockII {

    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
//        int[] prices = {1,2,3,4,5};
        int[] prices = {1};
        System.out.println("Maximum Profit: " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit=0;
        int buyingPrice=0;
        int sellingPrice=0;
        boolean holdProperty=false;
        for (int i=0 ; i<prices.length-1 ; i++) {
            if (!holdProperty && (prices[i+1]>prices[i])){
                buyingPrice=prices[i];
                holdProperty=true;
            }if(holdProperty && (prices[i+1]<prices[i])){
                sellingPrice=prices[i];
                profit+=(sellingPrice-buyingPrice);
                holdProperty=false;
            }
            if(holdProperty && (i==prices.length-2)){
                sellingPrice=prices[i+1];
                profit+=(sellingPrice-buyingPrice);
            }
        }
        return profit;
    }

}
