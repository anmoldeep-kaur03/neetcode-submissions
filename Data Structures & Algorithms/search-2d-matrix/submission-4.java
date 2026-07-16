class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        if(matrix.length == 1 && matrix[0].length == 1){
            if(matrix[0][0] == target) return true;
            else return false;
        }
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == target){
                return true;
            } else if(matrix[i][0] < target){ 
                row = i;
            }
        }
        for(int i = 0; i<matrix[row].length; i++){
            if(matrix[row][i] == target){
                return true;
            }
        }

        return false;
    }
}
