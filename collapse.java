import java.util.Arrays;
class collapse{

   public static int[] collapse(int[] ints){
      int newSize=(ints.length/2)+(ints.length%2);
      int[] collapse =new int[newSize];
      for(int i =0,j=0;i<ints.length-(ints.length%2);i+=2,j++){
         collapse[j]=ints[i]+ints[i+1];
      }
      if(ints.length%2==1){
         collapse[collapse.length-1]=ints[ints.length-1];
      }
      return collapse;
   } 
   
   
   public static void main(String[] args){
      int[] ints = {76,4,2,5,2,7,3,67,3,6,47474};
      System.out.println(Arrays.toString(collapse(ints)));   
   }
}