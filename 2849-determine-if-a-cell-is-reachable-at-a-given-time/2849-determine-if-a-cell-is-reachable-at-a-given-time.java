class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x = Math.abs(sx-fx);
        int y = Math.abs(sy-fy);
        int dist = Math.max(x,y);
        if(dist>t || (dist==0 && (t<2 && t>0)))
        {
            return false;
        }
        else {
            return true;
        }
    }
}