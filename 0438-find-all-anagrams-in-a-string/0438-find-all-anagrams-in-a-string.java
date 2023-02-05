class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pN = p.length();
        int sN = s.length();
        List<Integer> ans = new ArrayList<>();
        if(sN < pN)
            return ans;
        Map<Character, Integer> freq  = new HashMap<>();
        int zeroCount = 0;
        for(char c: p.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0)+1);
        int mapSize = freq.size();
        for(int i=0;i<pN;i++) {
            if(freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)-1);
                if(freq.get(s.charAt(i)) == 0)
                    zeroCount++;
            }
        }
        if(zeroCount == mapSize)
            ans.add(0);
        for(int i=pN;i<sN;i++) {
            if(freq.containsKey(s.charAt(i-pN))) {
                freq.put(s.charAt(i-pN), freq.getOrDefault(s.charAt(i-pN), 0)+1);
                if(freq.get(s.charAt(i-pN)) == 1)
                    zeroCount--;
            }
            if(freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)-1);
                if(freq.get(s.charAt(i)) == 0)
                    zeroCount++;
            }
            if(zeroCount == mapSize)
                ans.add(i-pN+1);
        }
        return ans;
    }
}