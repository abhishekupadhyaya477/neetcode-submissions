class Solution {
    public int[] productExceptSelf(int[] nums) {

        int countZ = 0;
        int prod = 1;

        for(int num: nums){
            if(num==0){
                countZ++;
                continue;
            }
            prod *= num;
        }

        int res[] = new int[nums.length];
        if(countZ>1){
            Arrays.fill(res,0);
            return res;
        }

        for(int i=0;i< res.length;i++){
            if(countZ==1){
                if(nums[i]==0) res[i]=prod;
                else res[i]=0;
            }else{
                res[i]=prod/nums[i];
            }
        }
        return res; 

    }
}  
