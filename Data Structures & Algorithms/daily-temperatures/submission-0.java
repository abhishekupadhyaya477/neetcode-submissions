class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int res[] = new int[len];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<len; i++){
            if(!st.isEmpty() && temperatures[st.peek()] > temperatures[i] || st.isEmpty()){
                st.push(i);
            }else{
                while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]){
                    int currIndex = st.pop();
                    int diff = i - currIndex;
                    res[currIndex] = diff;
                }
                st.push(i);
            }
        }

        return res;
    }
}
