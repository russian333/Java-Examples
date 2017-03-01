class HeadNode{

   public int length;
   public Element start;
   public Element end;
   
   public HeadNode(){
      this.length = 0;
      this.start = null;
      this.end = null;
   }
   
   public void add(Element d){
      if(this.length ==0){
         this.start = d;
         
      }else{
         this.end.next = d;
      }
      this.end = d;
      this.length++;
   }
   
   public void remove(int index){
      Element s = this.start;
      for(int i = 0; i < index ; i++){
         s = start.next;
      }
      Element temp = s.next;
      s.next = s.next.next;
      temp.next = null;
      this.length--;
   }
   
   public String get(int index){
      Element s = this.start;
      for(int i = 0; i < index ; i++){
         s = start.next;
      }
      return s.next.data;
   }
   
   public void update(int index,String set){
      Element s = this.start;
      for(int i = 0; i < index ; i++){
         s = start.next;
      }
      s.next.data = set;
   }
}