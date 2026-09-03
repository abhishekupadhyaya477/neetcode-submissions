class Solution {
    public int trap(int[] height) {

        if(height == null || height.length < 3) return 0;

        int l = 0;
        int r = height.length-1;
        int leftMax = height[l];
        int rightMax = height[r];
        int totalArea = 0;

        while(l < r){
            if(leftMax < rightMax){
                l++;
                leftMax = Math.max(leftMax, height[l]);
                totalArea += leftMax - height[l];
            }else{
                r--;
                rightMax = Math.max(rightMax, height[r]);
                totalArea += rightMax - height[r];
            }
        }

        return totalArea;
        
    }
}
