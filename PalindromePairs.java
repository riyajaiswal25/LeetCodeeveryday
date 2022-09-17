import java.util.*;
class Solution {
    boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=words.length;
        if(n<2)
            return ans;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String s=words[i];
            String sb = new StringBuilder(s).reverse().toString();
            map.put(sb,i);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=words[i].length();j++)
            {
                String s1=words[i].substring(0,j);
                String s2=words[i].substring(j);
                if(map.containsKey(s1) && isPalindrome(s2) && map.get(s1)!=i){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    list.add(map.get(s1));
                    ans.add(list);
                }
                if(!s1.isEmpty() && map.containsKey(s2) && isPalindrome(s1) && map.get(s2) != i)
                {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(map.get(s2));
                    list.add(i);
                    ans.add(list);
                }
            }
        }
        return ans;
        
    }
}
