class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0||nums.length==1) return nums.length;

        int maxSeq=1;
        HashSet<Integer> set=new HashSet<>();

        for(int num: nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int currNum=num;
                int currSeq=1;
                while(set.contains(currNum+1)){
                    currSeq++;
                    currNum++; 
                }
                maxSeq=Math.max(currSeq,maxSeq);
            }

        }
        
        return maxSeq;

    }
}
