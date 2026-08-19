
public class stock_buy_sell {
    public static void main(String args[]){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int min=prices[0], max=prices[0];

        for (int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){

                if (prices[j] - prices[i] > max-min){
                    min=prices[i];
                    max=prices[j];
                }

            }
        }
        
        System.out.println(max-min);
    }
}