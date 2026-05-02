class Solution {
    public String minWindow(String s, String t) {
       int sLen=s.length(), tLen=t.length();

       if(tLen>sLen) return "";

       int freqS[] =new int[128];
       int freqT[] =new int[128];
       
       int need=0;
       for (char c : t.toCharArray()) {
            if(freqT[c]==0) need++;
            freqT[c]++;
       }

       int minLen=Integer.MAX_VALUE;
       int left=0, have=0, startIdx=-1;



       for(int right=0;right<sLen;right++){

            char rChar=s.charAt(right);
            freqS[rChar]++;

            if(freqT[rChar]>0 && freqT[rChar]==freqS[rChar]){
                have++;
            }

            while(need==have){
                if((right-left+1)<minLen){
                    minLen=right-left+1;
                    startIdx=left;
                }

                char lChar=s.charAt(left);
                if(freqT[lChar]>0&&freqT[lChar]==freqS[lChar]){
                    have--;
                }
                freqS[lChar]--;
                left++;
            }

            
       }
    return startIdx==-1?"": s.substring(startIdx,startIdx+ minLen); 
    }
}
