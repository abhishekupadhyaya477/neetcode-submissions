class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int[] res = new int[k];

        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
                continue;
            }
            map.put(num,1);
        }

        Map<Integer, Integer> sortedMap = map.entrySet().stream()
    .sorted(Map.Entry.comparingByValue())
    .collect(Collectors.toMap(
        Map.Entry::getKey, 
        Map.Entry::getValue, 
        (e1, e2) -> e1, 
        LinkedHashMap::new
    ));
        Integer[] values = sortedMap.keySet().toArray(new Integer[0]);

        for (int resIndex = 0, mapIndex = values.length - 1; resIndex < k; resIndex++) {
            res[resIndex] = values[mapIndex--];
        }
        System.out.println(sortedMap);
        return res;


    }
}
