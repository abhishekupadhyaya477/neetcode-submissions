class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0;
        int currSeq = 0, maxSeq = 0;

        while(end<s.length()){
            char currChar = s.charAt(end);

            while(set.contains(currChar)){
                set.remove(s.charAt(start));
                start++;
                currSeq--;
            }
            set.add(currChar);
            currSeq++;
            maxSeq = Math.max(currSeq, maxSeq);
            end++;
        }

        return maxSeq;
    }
}
