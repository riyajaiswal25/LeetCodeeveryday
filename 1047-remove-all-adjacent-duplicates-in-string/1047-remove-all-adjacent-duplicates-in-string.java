class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            res.append(s.charAt(i));
            while(res.length() > 0 
            && i+1 < s.length()
            && res.charAt(res.length()-1) == s.charAt(i+1)){
                res.deleteCharAt(res.length()-1);
                i += 1;
            }
        }
        return res.toString();
    }
}