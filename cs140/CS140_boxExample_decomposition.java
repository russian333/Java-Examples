/*
      Brody Coleman
      9/21/2016
      CS140
      myClass.java
      
      First program for CS140.
*/

public class myClass{
   public static void cap(){
      System.out.println("----------");
   }
   public static void slice(){
      System.out.println("|        |"); 
   }
   public static void mid(){
      slice();
      slice();
      slice();
      slice();
      slice();
   }
   //Main function for running the program.
   public static void main(String[] args){
      cap();
      mid();
      cap();
   }
}
