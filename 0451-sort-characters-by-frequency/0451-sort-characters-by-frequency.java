class Solution {
    public String frequencySort(String s) {
      Map<Character, String> hs = new LinkedHashMap<>();
        for (Character c: s.toCharArray()) {
            hs.put(c, hs.getOrDefault(c, "") + c);
        } 
        List<Map.Entry<Character, String>> list = new ArrayList<>(hs.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character,String>>(){
            @Override
            public int compare(Map.Entry<Character,String> e1, Map.Entry<Character,String> e2) {
                return e2.getValue().length() - (e1.getValue().length());
            }
        });
        String str = "";
        for (Map.Entry<Character, String> h: list) {
            str += h.getValue();
        }
        return str;
    }
}