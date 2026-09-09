class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for(String token: tokens){
            if("+-*/".contains(token)){
                int right = st.pop();
                int left = st.pop();
                st.push(performOp(token, left, right));
            }else{
                st.push(Integer.parseInt(token));
            }
        }

        return st.peek();
        
    }

    private int performOp(String op, int left, int right){

        switch(op){

            case "+" : return left + right;

            case "-": return left - right;

            case "*": return left * right;

            case "/": return left / right;

            default: return 0;
        }
    }
}
