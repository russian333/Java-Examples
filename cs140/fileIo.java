
import java.io.*;
import java.util.*;

class fileIo{
   public static void main(String[] args) throws Exception{
      String filename = "coords";
      File text = new File("testFolder/"+filename+".txt");
      Scanner inData = new Scanner(text);
      PrintStream fixed = new PrintStream(new File("testFolder/"+filename+"2.txt"));
      while(inData.hasNextLine()){
         String src = inData.nextLine();
//          String x = src.substring(0,src.indexOf("@"));
//          String y = src.substring(src.indexOf("@")+1,src.indexOf("!"));
//          String z = src.substring(src.indexOf("!")+1);
         
         src = src.replace("@",",").replace("!",",");
         
         fixed.println(src);
      }
      double[] store = {0.0,0.0,0.0,9000.0};
      
      Scanner readData = new Scanner(new File("testFolder/"+filename+"2.txt"));
      while(readData.hasNextLine()){
         String line = readData.nextLine();
         String[] split = line.split(",");
         double[] coord = {Double.parseDouble(split[0]),Double.parseDouble(split[1]),Double.parseDouble(split[2])}
         double d = distance3(coord[0],coord[1],coord[2]);
         if(store[3]>d){
            store[3] = d;
            store[0] = coord[0];
            store[1] = coord[1];
            store[2] = coord[2];
         }
         //System.out.println("Smallest distance was : "+d+"\n coords: ("+ tx+" "+ty+" "+tz+").");
      }
      System.out.println("Smallest distance was : "+store[3]+"\n coords: ("+ store[0]+" "+store[1]+" "+store[2]+").");
   }
   
   public static double distance3(double x, double y ,double z){
      return (double)Math.sqrt(x*x+y*y+z*z);
   }
}