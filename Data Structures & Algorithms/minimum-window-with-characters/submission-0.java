class Solution {
    public String minWindow(String s, String t) {
       int sLen=s.length(), tLen=t.length();

       if(tLen>sLen) return "";

       int freqS[] =new int[128];
       int freqT[] =new int[128];

       for (char c : t.toCharArray()) {
            freqT[c]++;
       }

       String res="";
       int minLen=Integer.MAX_VALUE;
       int left=0;


       for(int right=0;right<sLen;right++){

            freqS[s.charAt(right)]++;

            while(isValidSubstring(freqT, freqS)){

                int currentWindowSize=right-left+1;
                if(currentWindowSize<minLen){

                    minLen=currentWindowSize;
                    res=s.substring(left,right+1);
                }

                freqS[s.charAt(left)]--;
                left++;
            }
       }

    return res;

        
    }

    public boolean isValidSubstring(int[] freqT, int[] freqS){
        for(int i=0;i<128;i++){
            if(freqT[i]>freqS[i]) return false;
        }
        return true;
    }
}
