class Solution {
    private boolean checkUniqueCharString(String str)
    {
        if(str.length()>26)
            return false;
        int[] freq = new int[26];
        char[] arr=str.toCharArray();
        for(char ch:arr){
            freq[ch-'a']++;
            if(freq[ch-'a']>1)
            {
                return false;
            }
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        List<String> ans=new ArrayList<>();
        int res=0;
        ans.add("");
        for(String str:arr)
        {
            if(!checkUniqueCharString(str))
                continue;
            List<String> newAns = new ArrayList<>();
            for(String cand:ans)
            {
                String temp=cand+str;
                if(checkUniqueCharString(temp))
                {
                    newAns.add(temp);
                    res=Math.max(res,temp.length());
                }
            }
            ans.addAll(newAns);
        }
        return res;
    }
}