import java.util.*;
import java.io.*;

class indent{
   private static int tabNum = 0;
   public static void main(String[] args) throws Exception{
      System.out.println("Enter the filename of a java to fix:");
      Scanner inFile = new Scanner(new File((new Scanner(System.in)).next()));
      System.out.println("Please enter a filename to which the result will be placed:");
      PrintStream outFile = new PrintStream(new File((new Scanner(System.in)).next()));
      while(inFile.hasNextLine()){
         String[] data = inFile.nextLine().trim().split("\\s+");
         if(data[0].endsWith("}")){
               tabNum--;
         }
         outFile.print((tabNum>0)?String.format("%"+tabNum+"s"," ").replace(" ","    "):"");
         for(String g:data){
            outFile.print(g +" ");
            if(g.endsWith("{")){
               tabNum++;
            }
         }
         outFile.println();
      }
   }
}