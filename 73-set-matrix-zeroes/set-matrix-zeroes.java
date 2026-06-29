class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowContainsZero = false;
        boolean columnContainsZero = false;
        int m=matrix.length;
        int n = matrix[0].length;
        // check the first row contains 0 or not.
        for(int i=0; i<n; i++){
            if(matrix[0][i] == 0){
                rowContainsZero = true;
                break;
            }
        }
        // check the first column contains 0 or not.
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0){
                columnContainsZero = true;
                break;
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowContainsZero){
            for(int i=0; i<n; i++){
            matrix[0][i] = 0;
        }
        }
        if(columnContainsZero){
            for(int i=0; i<m; i++){
            matrix[i][0] = 0;
        }
        }
    }
}