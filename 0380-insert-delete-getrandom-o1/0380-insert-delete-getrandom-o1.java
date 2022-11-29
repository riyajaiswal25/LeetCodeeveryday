class RandomizedSet {
    private List<Integer> nums;
    private Map<Integer, Integer> valToIndex;
    private Random rand=new Random();

    public RandomizedSet() {
        this.nums=new ArrayList<Integer>();
        this.valToIndex=new HashMap<Integer,Integer>();
    }
    
    public boolean insert(int val) {
        if(valToIndex.containsKey(val))
        {
            return false;
        }
        valToIndex.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!valToIndex.containsKey(val))
        {
            return false;
        }
        int ind=valToIndex.get(val);
        if(ind<nums.size()-1)
        {
            int last = nums.get(nums.size()-1);
            nums.set(ind,last);
            valToIndex.put(last,ind);
        }
        valToIndex.remove(val);
        nums.remove(nums.size()-1);
        return true;
        
    }
    
    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */