class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        Set<Integer> intersect = new HashSet<>();

        for(int num : nums1)
        {
            set.add(num);
        }

        for(int a : nums2)
        {
            if(set.contains(a))
            {
                intersect.add(a);
            }
        }

        int[] arr = new int[intersect.size()];

        int index = 0;

        for(int arr1 : intersect)
        {
            arr[index++] = arr1;

        }

        return arr;

        
        
    }
}