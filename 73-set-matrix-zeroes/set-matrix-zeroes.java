class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstColumn = false;
        int m = matrix.length;
        int n = matrix[0].length;
        //check firstRow contains 0 or not 
        for(int i=0; i<n; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
            }
        }

        //check firstColumn contains 0 or not 
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                firstColumn = true;
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow){
            for(int i=0; i<n; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstColumn){
            for(int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}