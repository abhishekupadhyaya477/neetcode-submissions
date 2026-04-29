class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s==null|| s.length()==0){
            return 0;
        }

        int maxSeq=0, currLen=0;
        int start=0, end=0;
        HashSet<Character> set= new HashSet<>();

        while(end<s.length()){
            char curr=s.charAt(end);
            if(set.contains(curr)){
                while(start<end && s.charAt(start)!=curr){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.remove(curr);
                start++;
            }
            set.add(curr);
            end++;
            currLen=end-start;
            maxSeq=Math.max(currLen,maxSeq);

        }
        return maxSeq;

    }
}
