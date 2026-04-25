class Solution {
    public int trap(int[] height) {

        int left[] = new int [height.length];
        int right[] = new int [height.length];

        int max=0;
        for(int i=0; i< left.length; i++){
            left[i]=max;
            max=Math.max(max, height[i]);
        }

        max=0;
        for(int i=right.length-1; i>0; i--){
            right[i]=max;
            max=Math.max(max, height[i]);
        }

        int totalArea=0;
        for(int i=0;i< height.length;i++){
        
            int currArea=Math.min(left[i],right[i]);

            totalArea += currArea>height[i] ? (currArea-height[i]) :0 ;
        }

        return totalArea;
        
    }
}
