class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Base
        if(strs.length==0) return new ArrayList<>();

        HashMap<String, List<String>> map =new HashMap<>();

        for(String str : strs){
            String sortedStr=sortString(str);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
    public String sortString(String str){
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        
        return new String(chars);
    }
}
