class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<Integer>();
        
        for(String ch: tokens){
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                st.push(performOp(ch, st.pop(), st.pop()));
            }else{
                st.push(Integer.parseInt(ch));
            }
        }

        return st.pop();
        
    }
    public int performOp(String operand, int right, int left){
        switch(operand){
            case "+" :
                return left + right;
                
            case "-" :
                return left - right;
                
            case "*" :
                return left * right;
                
            case "/" :
                return left / right;
               
            default :
                return -1;
        }
    }
}
