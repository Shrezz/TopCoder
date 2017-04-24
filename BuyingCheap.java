import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * User: shreya v
 * Date: 4/20/17
 */

public class BuyingCheap {

    public int thirdBestPrice(int[] prices) {

        if (prices.length == 0 || prices.length<=1) return -1;

        // try to implement your own sorting technique here //
        Arrays.sort(prices);

        Map<Integer,Integer> hashMap = new HashMap<>();
        int diffElements = 1;

        for (int i=0;i <prices.length; i++) {

            if (hashMap.containsKey(3)){
                return hashMap.get(3);
            }
            if(hashMap.containsValue(prices[i])){
                continue;
            }
            else {
                hashMap.put(diffElements,prices[i]);
                diffElements++;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        BuyingCheap bc = new BuyingCheap();
        int[] array  = {80, 90, 80, 90, 80};
        System.out.println(bc.thirdBestPrice(array));
    }
}
