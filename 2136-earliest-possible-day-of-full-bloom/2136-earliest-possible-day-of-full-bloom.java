class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        int [][] plants = new int [n][2];
        for(int i=0;i<n;i++) {
            plants[i][0]=plantTime[i];
            plants[i][1]=growTime[i];
        }
        // Sort in descending order according to plant time.
        Arrays.sort(plants,(int [] p1, int [] p2) -> {
            if(p1[1] > p2[1]) {
                return -1;
            } else if (p1[1]==p2[1]) {
                return 0;
            } else {
                return 1;
            }
            
        });

        // for(int i=0;i<n;i++) {
        //     System.out.println(plants[i][0] + " " + plants[i][1]);
        // }
        int day = 0, daysSpentPlanting = 0,prevDay=0;
        for(int i=0;i<n;i++) {
            int currenTime = plants[i][0] + plants[i][1];
            day = Math.max(prevDay,daysSpentPlanting + currenTime);
            prevDay = day;

            daysSpentPlanting += plants[i][0];
            
        }

        return day;
    }
}