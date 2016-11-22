import java.io.*;
import java.util.*;
class redir{
   public static void method1() throws Exception{
      File  outFile = new File("asdf.txt");
      PrintStream outstuff = new PrintStream(outFile);
      System.setOut(outstuff);
      
      System.out.println("test");
      System.out.println("\t data");
   }
   
   public static void method2() throws Exception{
      File outFile = new File("asdf.txt");
      PrintStream outstuff = new PrintStream(outFile);
      printThings(outstuff);
   
   }
   
   public static void printThings(PrintStream ps) throws Exception{
        ps.println("test");
        ps.println("\tdata");
   }
   public static void main(String[] args)throws Exception{
      method2();
   }
}