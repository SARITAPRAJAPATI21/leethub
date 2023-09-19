class Solution {
  public boolean isSafe(int row,int col,char[][] board){
    //horizontailly
    for(int j=0;j<board.length;j++){
      if(board[row][j]=='Q')
       return false;
    }
    //vertically
    for(int i=0;i<board[0].length;i++){
       if(board[i][col]=='Q')
        return false;
    }
    //upper left
    int r=row;
     for(int c=col;c>=0 && r >=0;r--,c--){
       if(board[r][c]=='Q')
        return false;
     }
     //uper right
     r=row;
     for(int c=col;c<board.length && r>=0;r--,c++){
        if(board[r][c]=='Q')
        return false;
     }
     // lower left 
     r=row;
     for(int c=col ;c>=0 && r<board.length; r++,c--){
        if(board[r][c]=='Q')
        return false;
     }
     // lower right
      for(int  c=col;c<board.length && r<board.length;r++,c++){
         if(board[r][c]=='Q')
        return false;
      }
       return true;
  }
  public void saveboard(List<List<String>> allboard,char[][] board){
    String row="";
    List<String> newboard=new ArrayList<>();

    for(int i=0;i<board.length;i++){
      row="";
      for(int j=0;j<board[0].length;j++){
        if(board[i][j]=='Q')    row+='Q';
        else                    row+='.';

      }
     newboard.add(row);
    }
    allboard.add(newboard);
  }
  public void helper(char[][] board,List<List<String>> allboard ,int col){
    if(col==board.length){
      saveboard(allboard,board);
      return ;
    }

    for(int row=0;row<board.length;row++){
      if(isSafe(row,col,board)){
        board[row][col]='Q';
        helper(board,allboard,col+1);
        board[row][col]='.';
      }
    }
  }
    public List<List<String>> solveNQueens(int n) {
      
      List<List<String>> allboard = new ArrayList<>();
        char [][] board =new char[n][n];
        helper(board,allboard,0); 
        return allboard;  
    }
}