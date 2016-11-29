import java.util.*;
class changeMake{
   public static void main(String[] args){
      double[] denoms ={100,50,20,10,5,1,.25,.1,.05,.01};
      ArrayList<Denom> bills = new ArrayList<Denom>();
      for(double d : denoms){
         bills.add(new Denom(d));
      }
      
      System.out.println("Enter the amount for which you need change:");
      double amount = (new Scanner(System.in)).nextDouble();
      for(Denom d : bills){
         amount = d.process(amount);
         if(d.getQuantity()>0){
            System.out.println("You get "+d.getQuantity()+" of "+(d.getDenom()<1?"coins":"bill")+" "+d.getDenom()+".");
         }
        }                    
                          
 
   }
}