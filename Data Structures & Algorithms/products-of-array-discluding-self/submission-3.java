class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct[] = new int[nums.length];
        int rightProduct[] = new int[nums.length];

        int leftProd=1;
        for(int i=0;i<nums.length;i++){
            leftProduct[i]=leftProd;
            leftProd*=nums[i];
        }

        int rightProd=1;
        for(int i=nums.length-1;i>=0;i--){
            rightProduct[i]=rightProd;
            rightProd*=nums[i];
        }

        int res[]=new int[nums.length];
        for(int i=0;i<res.length;i++){
            res[i]=leftProduct[i]*rightProduct[i];
        }

        return res;
    }
}  
