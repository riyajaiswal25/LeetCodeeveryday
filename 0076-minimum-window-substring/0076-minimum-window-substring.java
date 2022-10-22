class Solution {
    public String minWindow(String s, String t) {
        if(s == null || s.isEmpty() || t == null || t.isEmpty()) return "";
        int[] Tmap = new int[256];
        int[] Smap = new int[256];
        int left=0, right = 0;
        //recording the fre of each char from t
        for(int k = 0; k<t.length(); k++)
            Tmap[t.charAt(k)]++;
        
        int found = 0;
        int length = Integer.MAX_VALUE;
        
        String res = "";
        while(right < s.length()){
            //right forward
            if(found < t.length()){
                //move keep traversing
                if(Tmap[s.charAt(right)] > 0){
                    Smap[s.charAt(right)] ++;
                    if(Smap[s.charAt(right)] <= Tmap[s.charAt(right)]){
                        //This char is a target char and the fre is lower target fre
                        //We found it
                        found++;
                    }
                }
                right++;
            }
            //if the found equals to target length
            //if the found still equals to the target length, keep deleting (moving left forward)
            while(found == t.length()){
                //if get the shorter substring
                if(right - left < length){
                    length = right - left;
                    res = s.substring(left,right);
                }
                //move left forward
                if(Tmap[s.charAt(left)] > 0){
                    //fre of Smap decrease
                    Smap[s.charAt(left)]--;
                    //we delete a char
                    if(Smap[s.charAt(left)] < Tmap[s.charAt(left)]){
                        found--;
                    }
                }
                //move left forward
                left++;
            }
        }
        return res;
    }
}