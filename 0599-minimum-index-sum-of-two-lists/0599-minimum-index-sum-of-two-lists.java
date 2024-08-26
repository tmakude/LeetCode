class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        Map<String , Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int minValue = Integer.MAX_VALUE;

        for(int i = 0 ; i < list1.length ; i++)
        {
            map.put(list1[i],i);
        }

        for(int j = 0 ; j < list2.length ; j++){

            String str = list2[j];

            if(map.containsKey(str)){

                int indexSum = j + map.get(str);

                if (indexSum < minValue) {
                    list.clear();
                    list.add(str);
                    minValue  = indexSum;
                } else if (indexSum == minValue ) {
                    list.add(str);
                }

            }


        }

        return list.toArray(new String[list.size()]);
        
    }
}