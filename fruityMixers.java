import java.util.*;
class fruityMixers{
   public static void main(String[] args){
//       Fruit apple = new Fruit("red","crisp","sweet",1,153);
//       Fruit grape = new Fruit("green","squishy","sour",.08,70);
//       Fruit questionmark = apple.mix(grape);
//       System.out.println(questionmark);
      String[] colors = {"red","chathulu","purple","Noir","bruised"};
      String[] tastes = {"sweet","sour","bitter","violent"};
      String[] text = {"crisp","food"};
      ArrayList<Fruit> theGrouping = new ArrayList<Fruit>();
      for(int i = 0;i<12;i++){
         int ci =(int)(Math.random()*5);
         int ti = (int)(Math.random()*4);
         int tei = (int)(Math.random()*2);
         double s = (Math.random()*23);
         double w = (Math.random()*400);
         theGrouping.add(new Fruit(colors[ci],tastes[ti],text[tei],s,w));
      }
      Fruit starter = new Fruit("","","",0,0);
      for (Fruit f:theGrouping){
         starter = starter.mix(f);
      }
      
      //for(Fruit g:theGrouping){
      //starter.weight = 345443;
       
       System.out.println(starter.getWeight());
       starter.setWeight(150);
       System.out.println(starter);
       Fruit strange = new Fruit("grey","rock","dirt");
       System.out.println(strange);
       strange.setWeight(2000);
       System.out.println(strange);
       System.out.println(starter.COUNT);
      //}
   }

}