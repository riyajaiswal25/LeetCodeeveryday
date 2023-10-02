class Solution {
    public boolean winnerOfGame(String colors) {
        int a_count=countConsecutive(colors,'A');
        int b_count=countConsecutive(colors,'B');
        if(a_count>b_count)
            return true;
        else
            return false;
    }
    public int countConsecutive(String colors, char ch)
    {
        int c=0, i=1;
        while(i<colors.length()-1)
        {
            if(colors.charAt(i)==ch && colors.charAt(i+1)==ch && colors.charAt(i-1)==ch)
            {
                c++;
            }
            i++;
        }
        return c;
    }
}