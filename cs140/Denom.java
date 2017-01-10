class Denom{

   private double s;
   private int quantity;
   
   public Denom(double size){
      this.s = size;
   }
   
    public double process(double dollars) {
         if(dollars%this.s<=.01 && this.s==.01) {
             this.quantity = (int) Math.round(dollars / this.s+(100*(dollars%this.s)));// + (dollars%this.s>0?1:0);
             return 0;
 
         }
        this.quantity = (int) (dollars / this.s);
        return dollars % this.s;
    }
   
   public double getDenom(){
      return this.s;
   }
   public double getQuantity(){
      return this.quantity;
   }   

}