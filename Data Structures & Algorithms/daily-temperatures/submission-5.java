class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();

        int len = temperatures.length;
        int res[] = new int[len];

        for(int i=0; i<len; i++){

            int currTemp = temperatures[i];
            while(!st.isEmpty() && currTemp > temperatures[st.peek()]){
                int currIndex = st.pop();
                res[currIndex] = i-currIndex;
            }
            st.push(i);
        }
        return res; 
    }
}
