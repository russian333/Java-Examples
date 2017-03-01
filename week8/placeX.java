import java.util.*;

class placeX{

   public static char[][] board = new char[4][4];
   
   public static void main(String[] args){
         for(int i = 0; i < board.length ; i++){
            for(int j = 0; j < board.length ; j++){
               board[i][j] = ' ';
            }
         }
         findPlace(0);
   }

   public static void findPlace(int row){
      if(row == board.length){
         for(char[] n : board){
            System.out.println(Arrays.toString(n));
         }
         System.out.println();
         return;
      }
      for(int col = 0; col < board.length ; col++){
         if(safePlacement(row,col)){
            board[row][col] = 'x';
            
            findPlace(row + 1);
            
            board[row][col] = ' ';
         }
      }
   }
   
   public static boolean safePlacement(int r , int c){
      for(int i = 0; i < board.length ; i ++){
         if(board[r][i]!=' '){
            return false;
         }
         if(board[i][c]!=' '){
            return false;
         }
      }
      return true;
   }
}