/*
   Brody Coleman
   CS145
   01/10/17
   Methods.java
   
   In class work and demonstration of operation of various constructions of functions.


*/
import java.util.*;

class methods{
   public static void main(String[] args){
      
      func1();
      
      int returnInt = func2();
      System.out.println(returnInt);
      System.out.println(func2(55));
      
      returnInt = func3(55);
      System.out.println(returnInt);
      System.out.println(func3(55));
      
      returnInt = func4(45,6);
      System.out.println(returnInt);
      System.out.println(func4(45,6));
      
      returnInt = func5(4,6,32,2,7);
      System.out.println(returnInt);
      System.out.println(func5(4,6,32,2,7));
      
      System.out.println(func6("Title string",6,32,2,7));
      
      System.out.println(func7(7,3));
      System.out.println(func8(7,3));
   }
   
   public static void func1(){
      int value = 0;
      for(int i = 0; i < 20; i++){
         value+= i * i -i;
      }
      System.out.println(value);
   }
   
   public static int func2(){
      int value = 0;
      for(int i = 0; i < 20; i++){
         value+= i * i -i;
      }
      return value;
   }
   
   public static int func3(int inData){
      int value = 0;
      for(int i = 0; i < 20; i++){
         value+= inData * inData -i;
      }
      return value;
   }
   public static int func4(int inData,int otherData){
      int value = 0;
      for(int i = 0; i < 20; i++){
         value+= inData * inData -i;
      }
      return value - otherData;
   }
   
   public static int func5(int count,int... otherData){
      int sum = 0;
      for(int i =0; i< count;i++){
         sum+=otherData[i];
      }
      return sum;
   }
   public static String func6(String title,int... otherData){
      int sum = 0;
      for(int i =0; i< otherData.length;i++){
         sum+=otherData[i];
      }
      return title + " | with sum :" +sum;
   }
   
   public static boolean func7(int a, int b){
      if(a>b){
         return true;
      }else{
      
         return false;
      }
   }
   
   public static boolean func8(int a, int b){
      return a>b;
   }


}