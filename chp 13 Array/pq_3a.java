public class pq_3a {

    public static int buyAndSellStocks(int prices[]){
        int buyprice=prices[0];
        int maxprofit=0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice<prices[i]) {
               int profit=prices[i]-buyprice; 
               maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=prices[i];
            }
        }
      return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 6, 4, 3, 1};
        System.out.println(buyAndSellStocks(prices));
    }
}
