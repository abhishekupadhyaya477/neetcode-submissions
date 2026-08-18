class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;

        for(int i=0; i<len-2; i++){
            if(nums[i]>0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int start = i+1, end = len-1;
            while(start<end){
                int currSum = nums[start]+nums[end];
                if(currSum == target){
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    while(start<end && nums[start]==nums[start-1]){
                        start++;
                    }
                    while(start<end && nums[end]==nums[end+1]){
                        end--;
                    }
                }else if(currSum > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;
    }
}
