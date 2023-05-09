class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int rowB = 0;
        int rowE = matrix.length - 1;
        int colB = 0;
        int colE = matrix[0].length - 1;

         // Eg - [[1,2,3],[4,5,6],[7,8,9]]
        while(rowB <= rowE && colB <= colE){
            for(int i = colB ; i <= colE ; i++) // printing 1 , 2 , 3
                list.add(matrix[rowB][i]);
            
            rowB++;

            for(int i = rowB ; i <= rowE ; i++) // printing 6 , 9
                list.add(matrix[i][colE]);
            
            colE--;

            if(rowB <= rowE){
                for(int i = colE ; i >= colB ; i--) // printing 8 , 7
                    list.add(matrix[rowE][i]);
                
                rowE--;
            }
            if(colB <= colE){
                for(int i = rowE ; i >= rowB ; i--) // printing 4 , 5
                    list.add(matrix[i][colB]);
                
                colB++;
            }
        }
        return list;
    }
}