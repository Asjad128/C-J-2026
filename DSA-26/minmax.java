import java.util.Arrays;
public class minmax{
    public static void main(String args[]){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int min=prices[0], max=prices[0];
        for (int i: prices){
            if(i<min){
                min=i;
            }
        }
        for(int i=Arrays.asList(prices).indexOf(min); i<prices.length-1; i++){
            if (prices[i]>max){
                max=prices[i];
            }
        }
        System.out.println(max-min);
    }
}