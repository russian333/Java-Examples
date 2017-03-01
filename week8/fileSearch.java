import java.io.*;


class fileSearch{
   public static void main(String[] args){
      File startSpot = new File("\\\\huckleberry\\redirect$\\bcoleman\\");
      explore(startSpot);
//          String[] data = {"test","cs","brody","phone"};
//          StringLinkList sll = new StringLinkList(data);
//          System.out.println(sll.listData.get(2));
//          sll.listData.remove(2);
//          System.out.println(sll.listData.get(2));
   }

   public static void explore(File f){   
       if(f.isDirectory()){
           for(File sub : f.listFiles()){
               explore(sub);
           }
       }else{
          if(f.getName().contains("oubles")){
            System.out.println(f.getAbsolutePath());
          }
       }
   }
} 