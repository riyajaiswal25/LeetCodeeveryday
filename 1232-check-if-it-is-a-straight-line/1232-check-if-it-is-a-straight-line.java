class Solution {

    public boolean isPoint(int x, int y, double m, int a, int b){

        if((y-b) == m*(x-a)){
            return true;
        }


        return false;

    }



    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        int z = coordinates[0].length;
        int a = coordinates[0][0];
        int b = coordinates[0][1];
        
        if(n==1){
            return false;
        }

        if((coordinates[1][0] - coordinates[0][0]) == 0){
            System.out.println(n);
            int p = coordinates[0][0];
            for(int i = 0 ; i <n; i++){
                if(coordinates[i][0] != p){
                    return false;
                }
            }

            return true;
        }else{
            double m = (double)(coordinates[1][1] - coordinates[0][1])/(coordinates[1][0] - coordinates[0][0]);
            System.out.println(m);
            for(int i = 0 ; i<n ; i++){
                if(!isPoint(coordinates[i][0],coordinates[i][1],m,a,b)){
                    return false;
                }
        }
        }

        return true;        
    }
}
