class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String temp1="", temp2="";
        for(int i=0;i<word1.length;i++)
            temp1=temp1+word1[i];
        for(int i=0;i<word2.length;i++)
            temp2=temp2+word2[i];
        if(temp1.equals(temp2))
            return true;
        else
            return false;
    }
}