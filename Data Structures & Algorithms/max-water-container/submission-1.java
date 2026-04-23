class Solution {
    public int maxArea(int[] heights) {

        int maxArea=0;

        int start=0, end=heights.length-1;

        while(start<end){

           int currArea= (end-start)*Math.min(heights[start], heights[end]);
            maxArea=Math.max(maxArea, currArea);

            if(heights[start]>heights[end]){
                end--;
            }else{
                start++;
            }

        }
        return maxArea;
    }
}
