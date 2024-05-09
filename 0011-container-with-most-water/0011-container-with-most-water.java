class Solution {
    public int maxArea(int[] height) {
        //Use Two pointer Approach

        int maxarea = 0;
        int leftcolumn = 0;
        int rightcolumn=height.length - 1;

        while(leftcolumn < rightcolumn)
        {
            // Find minimum height column
            int mincolumn = Math.min(height[leftcolumn] , height[rightcolumn]);
            // find the weidth 
            int weidth = rightcolumn - leftcolumn;

            // find capacity of water store in rhat area
            int area= mincolumn * weidth ;

            maxarea = Math.max(maxarea , area );

            // Compare height of leftcolumn nad rigthcolumn

            if(height[leftcolumn] < height[rightcolumn])
            {
                leftcolumn++;
            }
            else
            {
             rightcolumn--;   
            }

        }

        return maxarea;



        





        
    }
}