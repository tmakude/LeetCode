class Solution {
    public int maxIceCream(int[] costs, int coins) {

        Arrays.sort(costs);

        int count = 0 ;
        int coinss = coins;

        for(int i =0 ; i < costs.length ; i++)
        {
            if(costs[i] <= coinss)
            {
                coinss -=costs[i];
                count++;
            }
        }

        return count;

        
        
    }
}