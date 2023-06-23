import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
         int profit = 0;
        int min_no = Integer.MAX_VALUE;
        for(int i=0;i<prices.size();i++){
            min_no=Math.min(min_no,prices.get(i));
            profit =Math.max(profit,prices.get(i)-min_no);
        }
        return profit;
    }
}
