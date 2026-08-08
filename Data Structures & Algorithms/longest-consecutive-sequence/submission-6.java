class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxSeq=0;

        for(int num: nums){
            set.add(num);
        }

        for(int num: set){
            if(!set.contains(num-1)){
                int currSeq=1;
                int currNum=num;
                while(set.contains(currNum+1)){
                    currSeq++;
                    currNum++;
                }
                maxSeq= currSeq> maxSeq? currSeq: maxSeq;
            }
        }
        return maxSeq;


    }
}
