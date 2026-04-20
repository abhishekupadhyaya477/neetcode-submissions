class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (n1,n2) -> map.get(n1)-map.get(n2)
        );

        for(int num: map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[] res = new int[k];
        for(int i=0; i < k; i++ ){
            res[i]=pq.poll();
        }
        
        return res;


    }
}
