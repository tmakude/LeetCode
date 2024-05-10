class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer , Integer> hashmap = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(hashmap.containsKey(nums[i]) && i - hashmap.get(nums[i]) <= k)
            {
                return true;
            }
            else
            {
                hashmap.put(nums[i] , i);
            }
        }

        return false;
       
       
    
}}