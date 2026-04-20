class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s: strs){
            sb.append(s.length()+"#");
            sb.append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
    List<String> res = new ArrayList<>();
    int i = 0;
    
    // Use a while loop since we are "jumping" through the string
    while (i < str.length()) {
        int j = i;
        // 1. Move j until we find the delimiter
        while (str.charAt(j) != '#') {
            j++;
        }
        
        // 2. Extract the length (from i to j)
        int length = Integer.parseInt(str.substring(i, j));
        
        // 3. Extract the actual string (starting right after j)
        // index j is the '#', so the string starts at j + 1
        String s = str.substring(j + 1, j + 1 + length);
        res.add(s);
        
        // 4. Move the pointer i to the start of the next length-prefix
        i = j + 1 + length;
    }
    
    return res;
}

}
