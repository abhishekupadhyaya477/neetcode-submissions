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
        List<String> res= new ArrayList<>();
        
        for(int i=0;i<str.length();i++){

            // Find # block
            int index=i;
            while(index<str.length()){
                if(str.charAt(index)=='#'){
                    int subLen=Integer.parseInt(str.substring(i,index));
                    String subStr=str.substring(index+1, index + 1 + subLen);
                    res.add(subStr);
                    i=index +  subLen;
                    break;
                }
                index++;
            }
        }
        return res;
    }

}
