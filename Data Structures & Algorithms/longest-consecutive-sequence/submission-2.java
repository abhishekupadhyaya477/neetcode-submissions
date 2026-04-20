class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int maxSeq=1,currSeq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                currSeq++;
            }else if(nums[i]-nums[i-1]>1){
                currSeq = 1;
            }
            maxSeq=Math.max(currSeq,maxSeq);
        }
        return maxSeq;

    }
}
