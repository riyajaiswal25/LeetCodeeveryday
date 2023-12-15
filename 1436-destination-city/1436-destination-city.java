class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> city = new HashSet<String>();
        for(int i=0;i<paths.size();i++)
        {
            city.add(paths.get(i).get(0));
        }
        for(int i=0;i<paths.size();i++)
        {
            if(!city.contains(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }
        return "";
    }
}