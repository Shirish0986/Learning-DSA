public class xii_BuyAndSellStocks {

    public static int buyandSellStocks(int prices[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;

        // Loop through each price in the array
        for (int i = 0; i < prices.length; i++) {

            //  Check if the current price is a better buying opportunity
            if (buyprice<prices[i]) {
                int profit=prices[i]-buyprice;  // Calculate the profit
                maxprofit=Math.max(maxprofit,profit);   // Update the maximum profit if the current profit is greater
            }else{
                buyprice=prices[i];   // Set the buying price to the current price if it's a better buying opportunity
            }
            
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandSellStocks(prices));
    }
}
