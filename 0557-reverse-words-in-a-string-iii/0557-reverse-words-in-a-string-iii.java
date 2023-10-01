class Solution {
    public String reverseWords(String s) {
        String[] array = s.split("\\s+");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<array.length;i++)
        {
            StringBuilder sb=new StringBuilder(array[i]);
            ans.append(sb.reverse());
            if(i!=array.length-1)
            ans.append(" ");
        }
        return ans.toString();
    }
}