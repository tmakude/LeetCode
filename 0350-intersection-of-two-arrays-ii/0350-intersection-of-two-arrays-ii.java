class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer , Integer> map = new HashMap<>();

        List<Integer> intersect = new ArrayList<>();

        //add elelement and its frequaency 

        for(int num : nums1)
        {
            map.put( num , map.getOrDefault(num , 0)+1);
        }

        // match the elemnets and add it into List and reduce frequency;

         for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersect.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int arr[] = new int[intersect.size()];

        int index=0;

        for(int num : intersect)
        {
            arr[index++]=num;

        }

        return arr;




    
        
    }
}