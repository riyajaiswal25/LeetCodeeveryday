class Solution {
    public int lengthOfLastWord(String s) {
        String[] ch =  s.split(" ");
        int n=ch.length;
        return ch[n-1].length();
    }
}