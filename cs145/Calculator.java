/*
    Brody Coleman
    CS145
    01/10/17
    Calculator.java
    
    This is a solution to the Calculator warm up problem using command line arguments.
    
*/

class Calculator{
    
   public static void main(String[] args){
       
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[2]);
      
      if(args[1].equals("+")){
          System.out.println(add(a,b));
      }else if(args[1].equals("-")){
          System.out.println(sub(a,b));
      }else if(args[1].equals("x")){
          System.out.println(mult(a,b));
      }else if(args[1].equals("/")){
          System.out.println(div(a,b));
      }else if(args[1].equals("%")){
          System.out.println(mod(a,b));
      }else if(args[1].equals("^")){
          System.out.println(pow(a,b));
      }
   }
   
   public static int add(int x, int y){
        return x + y;  
   }
   
   public static int sub(int x, int y){
        return x + y;  
   }
   
   public static int mult(int x, int y){
      return x * y;  
   }
   
   public static int div(int x, int y){
      return x / y;  
   }
   
   public static int mod(int x, int y){
      return x % y;  
   }
   
   public static int pow(int x, int y){
      return (int)Math.pow(x,y); 
   }
}