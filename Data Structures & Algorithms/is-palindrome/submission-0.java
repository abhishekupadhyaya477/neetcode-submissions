class Solution {
    public boolean isPalindrome(String str) {
        

        int start=0, end=str.length()-1;

        while(start<end){
            char startChar= str.charAt(start);
            char endChar= str.charAt(end);

            if(!Character.isLetterOrDigit(startChar)){
                start++;
            }
            else if(!Character.isLetterOrDigit(endChar)){
                end--;
            }
            else{
                if(Character.toLowerCase(startChar)!=Character.toLowerCase(endChar))
                    return false;
                start++;
                end--;
            }

        }
        return true;
    
    }
}
