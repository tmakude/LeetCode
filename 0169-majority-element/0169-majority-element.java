class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int start =0;
        int end=nums.length;
        int mid=(start+end)/2;
        return nums[mid];
        
    }
}