class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        int len= nums.length;
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0) +1);
        }
        
        List<Integer>[] buckets= new List[len+1];
        for(int num: map.keySet()){
            int freq= map.get(num);
            if(buckets[freq]==null){
                buckets[freq]= new ArrayList<>();
            }
            buckets[freq].add(num); 
        }

        int res[]= new int[k];
        int idx=0;
        for(int i = len; i >= 0 && idx < k; i--){

            if(buckets[i]!=null){
                for(int num:buckets[i]){
                    res[idx++]= num;
                    if(idx==k) return res;
                }
            }
        }

        return res;
    }
}
