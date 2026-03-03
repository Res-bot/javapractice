public class stock_price {
    public void maxProfit(int[] prices){
        int maxprof = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprof) {
                    maxprof = profit;
                }
            } 
        }
        System.out.println(maxprof);
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        stock_price sp = new stock_price();
        sp.maxProfit(arr);

    }
}
