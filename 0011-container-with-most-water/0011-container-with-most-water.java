class Solution {
    public int maxArea(int[] height) {
       

        // use two pointer aooroach

        int maxarea = 0 ;
        int leftColumn = 0 ;
        int rightCoulmn = height.length - 1;

        while(leftColumn < rightCoulmn)
        {
            int width = rightCoulmn -  leftColumn ;
            int minarea = Math.min(height[leftColumn] , height[rightCoulmn]);
            int currentarea= width * minarea;

            maxarea = Math.max(maxarea , currentarea);

            if(height[leftColumn]  < height[rightCoulmn])
            {
                leftColumn++;
            }
            else
            {
                rightCoulmn--;
            }

        }

        return maxarea;



        





        
    }
}