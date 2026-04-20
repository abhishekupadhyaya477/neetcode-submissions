class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String, List<String>> map =new HashMap<>();
        String[] sortedStrs=new String[strs.length];
        if(strs.length==0) return res;
        for(int i=0;i<strs.length;i++){
            String sortedStr=sortString(strs[i]);
            if(map.containsKey(sortedStr)){
                List<String> newList=map.get(sortedStr);
                newList.add(strs[i]);
                map.put(sortedStr,newList);
            }else{
                ArrayList<String> newList=new ArrayList<>();
                newList.add(strs[i]);
                map.put(sortedStr,newList);
            }
        }
        System.out.println(map);
        
        return new ArrayList<>(map.values());
    }
    public String sortString(String str){
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
    }
}
