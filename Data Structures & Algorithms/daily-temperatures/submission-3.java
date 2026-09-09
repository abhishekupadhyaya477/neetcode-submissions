class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int res[] = new int[len];

        for(int i = 0; i < len; i++){
            int currTemp = temperatures[i];
            
            while(!stack.isEmpty() && temperatures[stack.peek()] < currTemp){
                int currIndex = stack.pop();
                res[currIndex] = i - currIndex;
            }
            stack.push(i);
            
        }
        return res;
    }
}
