class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int srow = 0;
        int erow = matrix.length-1;
        int scol = 0;
        int ecol = matrix[0].length-1;
        while(srow <= erow && scol <= ecol){
            //top
            for(int i=scol; i<=ecol; i++){
                result.add(matrix[srow][i]);
            }
            //right
            for(int i=srow+1; i<=erow; i++){
                result.add(matrix[i][ecol]);
            }
            //bottom
            for(int i=ecol-1; i>= scol; i--){
                if(srow == erow) break;
                result.add(matrix[erow][i]);
            }
            //left
            for(int i=erow-1; i>srow; i--){
                if(scol == ecol) break;
                result.add(matrix[i][scol]);
            }
            srow++;
            erow--;
            scol++;
            ecol--;

        }
        return result;
    }
}