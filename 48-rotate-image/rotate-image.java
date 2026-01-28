class Solution {
    public void rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
      for(int i=0; i<matrix.length; i++){
        int column = matrix.length-1-i;
        for(int j=0; j<matrix[i].length; j++){
            result[j][column] = matrix[i][j];
        }
      }
      for(int i=0; i<result.length; i++){
        for(int j=0; j<result[i].length; j++){
            matrix[i][j] = result[i][j];
        }
      }
    }
}