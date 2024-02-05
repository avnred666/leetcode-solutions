/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 *
 */
public class BuyAndSellStock1 {
    public static int MaxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price: prices){
            if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(MaxProfit(new int[]{1, 2, 3, 4, 3, 21}));
    }
}
