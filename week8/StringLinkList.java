
import java.util.*;
class StringLinkList{// implements List<String>{
   
   public HeadNode listData;
   public StringLinkList(String[] data){
      super();
      this.listData = new HeadNode();
      for(String d : data){
         this.listData.add(new Element(d));
      }
      Element temp = listData.start;
      while(temp!=null){
         System.out.println(temp.data);
         temp = temp.next;
      }
   }
   
//    public StringLinkList subList(int start, int end){
//       return new StringLinkList();
//    }
}