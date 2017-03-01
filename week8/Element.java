class Element{
   public String data;
   public Element next;
   
   public Element(String s){
      this.data = s;
   }  
   
   public Element(String s, Element e){
      this.data = s;
      this.next = e;
   }
}