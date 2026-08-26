class Solution {
    public int maxArea(int[] heights) {

        int start = 0;
        int end = heights.length-1;
        int maxArea = 0;

        while(start < end){
            int currArea = Math.min(heights[start], heights[end]) * (end-start);
            maxArea = Math.max(currArea, maxArea);

            if(heights[start] < heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
        
    }
}
