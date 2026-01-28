class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int srow = 0,erow=matrix.length-1,scol=0,ecol=matrix[0].length-1;
        List<Integer> al = new ArrayList<>();
        while(srow <= erow && scol<=ecol){
            for(int i=scol; i<=ecol; i++){
                al.add(matrix[srow][i]);
            }
            for(int i=srow+1; i<=erow; i++){
                al.add(matrix[i][ecol]);
            }
            for(int i=ecol-1; i>=scol;i--){
                if(srow != erow){
                    al.add(matrix[erow][i]);
                }
            }
            for(int i=erow-1; i>= srow+1; i--){
                if(scol != ecol){
                    al.add(matrix[i][scol]);
                }
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return al;
    }
}