class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket= new List[nums.length+1];

        for(int key:map.keySet()){

            int freq=map.get(key);

            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int resIndex=0;
        int res[]=new int[k];

        for(int i=bucket.length-1;i>=0;i--){

            if(bucket[i]!=null){
                for(int num: bucket[i]){
                    res[resIndex++]=num;

                    if(resIndex==k){
                        return res;
                    }
                }
            }
        }
        return res;

    }
}
