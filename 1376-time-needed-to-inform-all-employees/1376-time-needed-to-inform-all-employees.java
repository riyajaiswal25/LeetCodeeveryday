class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] info) {

        int time[] =  new int[manager.length];
        Arrays.fill(time,-1);

        time[headID] = 0;

        for(int i = 0; i < n; i++)
        {
            findTime(i,manager,info,time);
        }

        int ans = 0;
        for(int i = 0; i < n; i++)
        {
            System.out.print(time[i] + " ");
            ans = Math.max(ans,time[i]);
        }

        return ans;
        
    }

    int findTime(int emp, int[] manager, int[] info, int [] time)
    {
        if(manager[emp] == -1)
            return 0;

        if(time[emp] != -1)
            return time[emp];    

        time[emp] = info[manager[emp]] + findTime(manager[emp],manager,info,time);  

        return time[emp];  
    }
}