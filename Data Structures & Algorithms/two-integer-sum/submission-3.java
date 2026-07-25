class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int targetVal = target-nums[i];

            if(map.containsKey(targetVal)){
                return new int[]{map.get(targetVal),i};
            }

            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
 