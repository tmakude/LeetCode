class Solution {
    public int thirdMax(int[] nums) {
 TreeSet<Integer> uniqueNums = new TreeSet<>();
        
        
        for (int num : nums) {
            uniqueNums.add(num);
           
            if (uniqueNums.size() > 3) {
                uniqueNums.pollFirst();
            }
        }
        
     
        if (uniqueNums.size() < 3) {
            return uniqueNums.last();
        }
        
       
        return uniqueNums.first();

    
    }
}