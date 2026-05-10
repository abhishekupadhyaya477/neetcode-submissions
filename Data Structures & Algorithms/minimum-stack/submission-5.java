class MinStack {
    private Stack<Integer> myStack;
    private Stack<Integer> minStack;
    public MinStack() {
        myStack = new Stack<Integer>(); 
        minStack = new Stack<Integer>(); 
    }
    
    public void push(int val) {

        myStack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
    }
    
    public void pop() {

        if(myStack.peek().equals(minStack.peek())){
            minStack.pop();
        }

        myStack.pop();
    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
       return  minStack.peek();
    }
}
