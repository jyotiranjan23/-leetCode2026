class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstColumn = false;
        //travers the 2d array and if you found 0 then mark 0 in it's   corresponding first row and first column.
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(i==0) firstRow = true;
                    if(j==0) firstColumn = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //travers the 2d array from column = 1 and row =1 and if the marker value is 0 then make it as 0.
        for(int i=1; i< matrix.length; i++){
            for(int j=1; j< matrix[i].length; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //if first row contains 0 then make the entire first row as 0
        if(firstRow){
            for(int i=0; i< matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

        //if first cplumn contains 0 then make the entire column as 0
        if(firstColumn){
            for(int i=0; i< matrix.length; i++){
                matrix[i][0] = 0;
            }
        }

        
        
    }
}