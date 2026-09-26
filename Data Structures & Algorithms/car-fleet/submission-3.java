class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int pair[][] = new int [position.length][2];

        for(int i=0; i<position.length; i++){
            
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a,b) -> a[0] - b[0]);
        Stack<Double> st = new Stack<>();

        for(int i = position.length-1; i>=0; i--){

            double reachingT = (double)(target - pair[i][0]) / pair[i][1];

            if(!st.isEmpty() && st.peek() < reachingT){
                st.push(reachingT);
            }else if(st.isEmpty()){
                st.push(reachingT);

            }

        }

        return st.size();

    }
}
