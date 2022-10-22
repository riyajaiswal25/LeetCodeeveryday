class Solution {
    public String minWindow(String s, String t) {
        String ans="";
        HashMap<Character, Integer> mapt = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            mapt.put(ch, mapt.getOrDefault(ch,0)+1);
        }
        int mct=0;
        int dmct=t.length();
        HashMap<Character, Integer> maps = new HashMap<>();
        int i=-1;
        int j=-1;
        while(true)
        {
            boolean f1=false;
            boolean f2=false;
            while(i<s.length()-1 && mct<dmct)
            {
                i++;
                char ch=s.charAt(i);
                maps.put(ch,maps.getOrDefault(ch,0)+1);
                if(maps.getOrDefault(ch,0)<=mapt.getOrDefault(ch,0))
                {
                    mct++;
                }
                f1=true;
            }
            while(j<i && mct==dmct)
            {
                String pans=s.substring(j+1,i+1);
                if(ans.length()==0 || pans.length()<ans.length())
                {
                    ans=pans;
                }
                j++;
                char ch=s.charAt(j);
                if(maps.get(ch)==1)
                {
                    maps.remove(ch);
                }
                else{
                    maps.put(ch,maps.get(ch)-1);
                }
                if(maps.getOrDefault(ch,0)<mapt.getOrDefault(ch,0))
                {
                    mct--;
                }
                f2=true;
            }
            if(f1==false && f2==false)
                break;
        }
        return ans;
    }
}