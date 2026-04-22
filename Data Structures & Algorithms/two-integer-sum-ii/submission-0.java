class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0, end=numbers.length-1;
        while(start<end){
            int currSum=numbers[start]+ numbers[end];

            if(currSum==target){
                return new int[]{start+1,end+1};
            }else if(currSum>target){
                end--;
            }else{
                start++;
            } 
        }
        return new int[]{};

    }
}
