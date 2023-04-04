class Solution {
    public int partitionString(String s) {
        int co=0;
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                co++;
                set=new HashSet<>();
                set.add(c);
            }
            else
                set.add(c);
        }
        if(!set.isEmpty())
            co++;
        return co;
    }
}