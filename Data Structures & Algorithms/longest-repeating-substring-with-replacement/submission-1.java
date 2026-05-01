class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]= new int[26];
        int start=0, maxLen=0, maxFreq=0;

        for(int end=0;end< s.length(); end++){

            char currChar=s.charAt(end);
            freq[currChar-'A']++;

            maxFreq=Math.max(maxFreq, freq[currChar-'A']);

            while((end-start+1)-maxFreq>k){
                freq[s.charAt(start)-'A']--;
                start++;
            }
            maxLen=Math.max(maxLen, end-start+1);

        }
        return maxLen;  
    }
}