
import java.util.*;
import java.io.*;
class imageSearch{
   public static void main(String[] args) throws Exception{
      Scanner in = new Scanner(new File("lego.txt"));
      String dat = "";
      while(in.hasNextLine()){
         dat+=in.nextLine()+"\n";
      }
      String[] split = dat.split(".jpg|.png");
      for(int i =0; i < split.length-1;i++){
         System.out.println(split[i]);
      }
      
   }
}