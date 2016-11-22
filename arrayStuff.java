class arrayStuff{

   public static void main(String[] args){
      int size = 3;
      int[][] myInts = {{15,3,8},{62,8,2},{11,2,9}};
      int sum1 = 0,sum2=0;
      for(int i = 0,j = size-1;i<size && j>=0;i++,j--){
         sum1+=myInts[i][i];
         sum2+=myInts[i][j];
      }
      System.out.println(Math.abs(sum1-sum2));
      
   }

}