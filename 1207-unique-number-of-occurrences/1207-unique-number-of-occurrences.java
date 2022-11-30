class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         int n = arr.length;
        Map<Integer,Integer> hm = new HashMap<>(); 

        for(int i=0;i<n;i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i],hm.get(arr[i])+1);
            } else {
                hm.put(arr[i],1);
            }
        }
        Set<Integer> hs = new HashSet<>();
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry mapElement = (Map.Entry)it.next();
            hs.add((int)mapElement.getValue());
        }

        if(hs.size() != hm.size()) {
            return false;
        } else {
            return true;
        }
    }
}