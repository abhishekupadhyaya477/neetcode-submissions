class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0) return new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str: strs){

            String sortedStr=getKey(str);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }

    public String getKey(String str){
        int freq[] = new int[26];

        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            sb.append('#');
            sb.append(freq[i]);
        }

        return sb.toString();

    }

}
