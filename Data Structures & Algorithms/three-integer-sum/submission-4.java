class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i< len-2; i++){

            if(i > 0 && nums[i] == nums[i-1] || nums[i] > 0) continue;

            int start = i+1;
            int end = len-1;
            int target = - nums[i];

            while(start < end){

                int currSum = nums[start] + nums[end];

                if(currSum > target){
                    end--;
                }else if(currSum < target){
                    start++;
                }else{
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start-1]) start++;
                    while(start < end && nums[end] == nums[end+1]) end--;
                }

            }
        }
        return res;
    }
}
