class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE ,second = Integer.MAX_VALUE;
      for(int x: nums)
      {
          if(x<first)
          {
              first = x;
          }
          else if(first < x && x < second)
          {
              second = x;
          }
          else if(x > second)
          {
              return true;
          }
      }
        return false;
    }
}