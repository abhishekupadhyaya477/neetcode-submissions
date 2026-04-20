class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct[] = new int[nums.length];
        int rightProduct[] = new int[nums.length];

        int totalLeftProd=1;
        for(int i=0;i<leftProduct.length;i++){
                leftProduct[i]=totalLeftProd;
                totalLeftProd*=nums[i];  
        }

        int totalRightProd=1;
        for(int i=rightProduct.length-1;i>=0;i--){
                rightProduct[i]=totalRightProd;
                totalRightProd*=nums[i];  
        }

        int res[] = new int [nums.length];
        for(int i=0;i<res.length;i++){
            res[i]=leftProduct[i]*rightProduct[i];
        }

        return res;

    }
}  
