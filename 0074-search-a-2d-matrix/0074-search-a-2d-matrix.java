class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)  return false;
        if(matrix.length==1 &&matrix[0].length==1)
          return matrix[0][0]==target ? true : false;
        int r=0;
        int c=matrix[0].length-1;
        while((r>=0 && r<matrix.length) &&c>=0){

            if(matrix[r][c]==target){
                return true;
            } 

            if(matrix[r][c]<target)
             r++;
        
            else 
             c--;
        }
        return false;
        
    }
}