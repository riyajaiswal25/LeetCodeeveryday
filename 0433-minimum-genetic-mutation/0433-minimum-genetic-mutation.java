class Solution {
    public int minMutation(String start, String end, String[] bank) {
         List<String> banklist=Arrays.asList(bank);
        
        char[] letter=new char[]{'A','C','G','T'};
        Queue<String> queue=new LinkedList<>();
        Set<String> set=new HashSet<>();
        
        queue.add(start);
        set.add(start);
        
        int count=0;
        while(!queue.isEmpty())
        {
            int len=queue.size();
            
            for(int i=0;i<len;i++)
            {
                String node=queue.remove();
                
                if(node.equals(end))
                {
                    return count;
                }
                
                  
                for(char c:letter)
                {
                    for(int j=0;j<node.length();j++)
                    {
                        String temp=node.substring(0,j)+c+node.substring(j+1);
                        if(set.contains(temp)==false && banklist.contains(temp))
                        {
                            set.add(temp);
                            queue.add(temp);
                        }
                    }
                }
                //count++;
            }
            
            count++;
        }
        return -1;
    }
}