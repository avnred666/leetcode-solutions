/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 *
 */
public class BuyAndSellStock1 {
    public static int MaxProfit(int[] prices){
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minProfit){
                minProfit = price;
            }
            else if(price - minProfit > maxProfit){
                maxProfit = price - minProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(MaxProfit(new int[]{1, 2, 3, 4, 3, 21}));
    }
}
