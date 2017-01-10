/*
   Brody Coleman
   CS145
   triFigs.java
   01/09/17
   
   A demo file for class. Demonstrates usage of decomposition, void functions, global invariants and basic for loops.
*/


class triFigs{
   
   //Sets a size to 10. Can be changed to another even number to change the size of the figure drawn
   public static final int SIZE = 9;  
         
   //Main method of the program. Uses sub procedures to execute the problem.
   //This method acts as a high level overview of how the problem works.
   //For more detail about the actual implementation, We must read over the sub-procedures.
   public static void main(String[] args){
      drawSep();
      upTri();
      downTri();
      drawSep();
      downTri();
      upTri();
      drawSep();
   }
   
   //drawSep is a void return method that simply prints out the box top or bottom.
   public static void drawSep(){
      String content = String.format("+%"+SIZE+"s+"," ").replace(" ","-");
      System.out.println(content);
   }
   
   //Draws the triangle which is sitting on its base.
   public static void upTri(){
      int rows = ((SIZE-1)/2);
      
      for(int i = 0;i<rows;i++){
         String content = "|";
         String spacing = "";
         for(int j = 0; j<rows-i;j++){
            spacing+=" ";
         }
         content+=spacing;
         for(int j = 0; j<i;j++){
            content+="/";
         }
         content+="*";
         for(int j = 0; j<i;j++){
            content+="\\";
         }      
         content+=spacing+"|";
         /*
         String spaces = ((rows-i>0)?String.format("%"+(rows-i)+"s"," "):"");
         String slash = ((i>0)?String.format("%"+(i)+"s"," "):"");
         content = "|"+spaces+slash.replace(" ","/")+"*"+slash.replace(" ","\\")+spaces+"|";
         */
         System.out.println(content);
      } 
   }
   
   //Draws the triangle which is sitting on its point.
   public static void downTri(){
      int rows = ((SIZE-1)/2);
      
      for(int i = rows-1;i>=0;i--){
         String content = "|";
         for(int j = 0; j<rows-i;j++){
            content+=" ";
         }
         for(int j = 0; j<i;j++){
            content+="\\";
         }
         content+="*";
         for(int j = 0; j<i;j++){
            content+="/";
         }
         for(int j = 0; j<rows-i;j++){
            content+=" ";
         }
         content+="|";
         /*
         String spaces = ((rows-i>0)?String.format("%"+(rows-i)+"s"," "):"");
         String slash = ((i>0)?String.format("%"+(i)+"s"," "):"");
         content = "|"+spaces+slash.replace(" ","\\")+"*"+slash.replace(" ","/")+spaces+"|";
         */
         System.out.println(content);
      } 
   }
}