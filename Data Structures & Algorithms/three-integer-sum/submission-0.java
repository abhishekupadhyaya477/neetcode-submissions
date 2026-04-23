class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int target = -nums[i];
            int start = i + 1, end = n - 1;
            
            while (start < end) {
                int currSum = nums[start] + nums[end];
                if (currSum < target) {
                    start++;
                } else if (currSum > target) {
                    end--;
                } else {
                    // Found a triplet
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    start++;
                    end--;
                    
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }
        }
        return res;
    }
}