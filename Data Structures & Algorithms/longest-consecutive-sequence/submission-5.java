class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int maxSeq=0;

        for(int num: nums){
            set.add(num);
        }

        for(int num: set){
            if(!set.contains(num-1)){
                int currNum=num;
                int currSeq=1;
                while(set.contains(currNum+1)){
                    currNum++;
                    currSeq++;
                }
                maxSeq=Math.max(currSeq, maxSeq);
            }
        }
        return maxSeq;
    }
}
