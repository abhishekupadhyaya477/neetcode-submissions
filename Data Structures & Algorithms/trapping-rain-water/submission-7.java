class Solution {
    public int trap(int[] height) {

        if( height == null || height.length <3) return 0;

        int len = height.length;
        int leftMax[] = new int[len];
        leftMax[0] = 0;

        for(int i=1; i< len; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i-1]);
        }

        int rightMax[] = new int[len];
        rightMax[len-1] = 0;

        for(int i=len-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i+1]);
        }

        int area = 0;
        for(int i=0; i<len; i++){
            int currArea = Math.min(leftMax[i], rightMax[i]) - height[i];
            area = area + (currArea>0 ? currArea : 0);
        }

        return area;
    }
}
