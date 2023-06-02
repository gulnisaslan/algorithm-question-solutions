class WaterBottle
{
     public int NumWaterBottles(int numBottles, int numExchange) {
       
        int plusBottle = numBottles;
        while(numBottles>=numExchange){
            numBottles -= (numExchange-1);
            ++plusBottle;
        }
        return plusBottle;
    }
}