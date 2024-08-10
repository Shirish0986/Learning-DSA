public class pq_3 {

    public static int buyAndSellStocks(int prices[]){
        int maxprofit=0;
        int buyprices=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyprices<prices[i]) {  // checking for profit
                int profit=prices[i]-buyprices;   //calculating profit 
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprices=prices[i];
            }
            
        } 
        return maxprofit; 

    }
    public static void main(String[] args) {
        int prices[] = {7, 6, 4,  3, 1};
        System.out.println(buyAndSellStocks(prices));

    }
}
