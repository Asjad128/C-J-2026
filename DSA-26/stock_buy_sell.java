
public class stock_buy_sell {
    public static void main(String args[]){
        
        int[] prices={7,1,4,5,6,2,8, 2};
        
        int min=prices[0];
        int diff=0;

        for (int i=0; i<prices.length-1; i++){
            System.out.println(i+"="+prices[i]);
            
            if(min>prices[i]){
                min=prices[i];
                System.out.println(i+"1-min: "+min);
                continue;
            }

            if(prices[i+1] - prices[i] > prices[i] - min){
                min=prices[i];
                diff=prices[i+1]-min;
                System.out.println(i+"2-min: "+min);
                continue;
            }

            

            if(prices[i]-min > diff){
                diff = prices[i]-min;
                System.out.println(i+"3-min: "+min);
            }

        }
        
        System.out.println(diff);
    }
}