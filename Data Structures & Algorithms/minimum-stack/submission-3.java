class MinStack {
    public int min=Integer.MAX_VALUE;
    public Stack<Integer> myStack;
    public Stack<Integer> minStack;
    public MinStack() {
        myStack = new Stack<Integer>(); 
        minStack = new Stack<Integer>(); 
    }
    
    public void push(int val) {
        min=Math.min(min,val);
        myStack.push(val);
        minStack.push(min);
    }
    
    public void pop() {
        myStack.pop();
        if(minStack.pop()==min && !minStack.empty()) min=minStack.peek();
        if(minStack.empty()) min=Integer.MAX_VALUE;


    }
    
    public int top() {
        return myStack.peek();
    }
    
    public int getMin() {
       return  minStack.peek();
    }
}
