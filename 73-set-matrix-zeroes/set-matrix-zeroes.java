class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstColumn = false;
        //traverse the matrix from row0 and column0 and if you found 0 then make the corespending 0th row and 0th column as 0.
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(i==0) firstRow = true;
                    if(j==0) firstColumn = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //traverse the matrix from row1 to column1 if the marker is 0 then make it as 0
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(firstRow){
            for(int i=0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstColumn){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}