class Solution {
    public int[] twoSum(int[] nums, int target) {

        int arr[] = new int[2];

        for(int i = 0 ; i< nums.length-1 ; i++)
        {
            for(int k= i+1 ; k < nums.length ; k++)
            {
                if(nums[i] + nums[k] == target)
                {
                    return new int[]{ i , k};
                }
            }
        }
        return null;
        
        
       
    }
}
