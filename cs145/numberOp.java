import java.util.*;
import java.io.*;

class numberOp{
   
   public static int threadNum = 4;
   public static ArrayList<Integer> ints  = new ArrayList<Integer>();
   public static double[] data = new double[threadNum];
   
   public static void main(String[] args) throws Exception{
      
      Scanner feed = new Scanner(new File("averageTask.txt"));
      while(feed.hasNextInt()){
         ints.add(feed.nextInt());
      }
      System.out.println(ints.size());
      int z = 0;
      for(int x = -10000; x<=0 ; x++){
         if(x==0)
            z++;
      }
      
      normProc(ints);
      
      threadProc(ints);
      
   }
   
   public static void normProc(ArrayList<Integer> ali){

      //long start = System.nanoTime();
   
      double total = 0.0;
      for(int x : ali){
         total+=x;
      }
      double average = ((double)total)/ali.size();
      
      //long finish = System.nanoTime();
      System.out.println("With normal processing found average to be: "+average);//+"\nIt took time: "+ (finish-start));
   }
   
   public static void threadProc(ArrayList<Integer> ali){
      ArrayList<Thread> doWork = new ArrayList<Thread>();
      for(int x = 0 ; x <threadNum ; x++){
         doWork.add(makeThread(ali,x));
      }
      
      //long start = System.nanoTime();
      for(Thread r : doWork){
         r.start();
      }
      
      int spin = 1;
      while(data[3]==0 || data[2]==0 ||data[0]==0 || data[1]==0){
            spin++;
      }
      double sum = 0.0;
      for(double d : data){
         sum+=d;
      }
      double average = sum/data.length; 
      //long finish = System.nanoTime();
      System.out.println("With thread processing found average to be: "+average);//+"\nIt took time: "+ (finish-start));
   }
   
   public static Thread makeThread(ArrayList<Integer> ali,int index){
      return new Thread(new Runnable(){
      
         private int thnum = index;
         private int elecount = ali.size()/threadNum;
         private List<Integer> slice = ali.subList(elecount*thnum,(elecount*(thnum+1)));
         
         @Override
         public void run(){
            int total = 0;
            for(int x : slice){
               total+=x;
            }
            data[thnum]= ((double)total)/slice.size();
         }
      });
   }
}
