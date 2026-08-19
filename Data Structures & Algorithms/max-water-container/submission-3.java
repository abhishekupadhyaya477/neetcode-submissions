class Solution {
    public int maxArea(int[] heights) {
        
        int maxArea = 0;
        int start = 0, end = heights.length-1;

        while(start < end){
            int height = Math.min(heights[start], heights[end]);
            int width = end-start;
            int currArea = height*width;
            maxArea = Math.max(currArea,maxArea);

            if(heights[start] > heights[end]){
                end--;
            }else{
                start++;
            }
        }
        return maxArea;
    }
}
