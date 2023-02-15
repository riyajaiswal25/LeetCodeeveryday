class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>li=new ArrayList<Integer>();
        int n=num.length;
        int i=n;
        while(--i>=0 ||k>0){
            if(i>=0){
                k=k+num[i];
            }
                li.add(k%10);
                k=k/10;
        }
        Collections.reverse(li);
        return li;
    }
}