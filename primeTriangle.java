class primeTriangle{

   public static int MAX = 5; 
   public static void main(String[] args){
      for(int i = MAX;i>=1;i-=2){
         for(int jk = 0;jk<(MAX-i)/2;jk++){
            System.out.print("-");
         }
         for(int j=0;j<i;j++){
            System.out.print(i+"");
         }
         for(int jk = 0;jk<(MAX-i)/2;jk++){
            System.out.print("-");
         }
         System.out.println();
      }
   
   }


}