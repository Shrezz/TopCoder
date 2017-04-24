
/*
 * User: shreya v
 * Date: 4/23/17
 */
public class RGBStreet {


    public int estimateCost(String[] houses) {

        return estimateCost(houses,-1,0,Integer.MAX_VALUE,0);
    }

    private int estimateCost(String[] houses, int previousColor, int houseNumber, int bestPrice, int sum)  {

        if (houseNumber >= houses.length) {
            return sum;
        }
        String[] price = houses[houseNumber].split(" ");
        for (int i=0;i <3;i++) {
            if (i!= previousColor) {
                bestPrice = Math.min(bestPrice, estimateCost(houses, i, houseNumber+1, bestPrice, sum + Integer.parseInt(price[i])));
            }
        }
        return bestPrice;
    }

    public static void main(String args[]) {
        RGBStreet rgbStreet = new RGBStreet();
        String[] houses = {"1 100 100", "100 100 100", "1 100 100"};
        System.out.println(rgbStreet.estimateCost(houses));
    }


}
