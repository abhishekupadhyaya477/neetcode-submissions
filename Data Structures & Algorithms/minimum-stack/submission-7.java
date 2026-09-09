class MinStack {

    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        int min = val;
        if(!minSt.isEmpty()){
           min = Math.min(min, minSt.peek());
        }

        minSt.push(min);
    }
    
    public void pop() {
        st.pop();
        minSt.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
