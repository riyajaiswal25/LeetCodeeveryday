class MyCalendarThree {
   TreeMap<Integer,Integer> map;
    public MyCalendarThree() {
      map=new TreeMap<>();
    }
    
    public int book(int start, int end) {
       map.put(start, map.getOrDefault(start, 0) + 1);
       map.put(end, map.getOrDefault(end, 0) - 1);
      
       int count=0;
       int maxcount=0;
   
      for(int value: map.values()){
        count+=value;
        maxcount=Math.max(count,maxcount);
      }
      return maxcount;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */