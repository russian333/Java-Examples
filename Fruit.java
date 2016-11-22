/*
   Brody Coleman
   CS140
   11/21/2016
   Fruit.java
   
   This class contains the Fruit class. It is an example class used in
   the instruction of object oriented programming to display various
   different techniques for designing classes.
   
*/
public class Fruit{
   
   //COUNT :  A publicly available int commonly  shared between
   //all objects of the class initially set to the value of 0.
   public static int COUNT = 0;
   
   //DERP A publicly available unchangable int commonly  shared between
   //all objects of the class initially set to the value of 0.
   public static final int DERP = 464646464;
   
   //The following 5 fields describe the attributes of a member of this class.
   // 3 x String
   // 2 x double
   private String color;
   private String texture;
   private String taste;
   private double size;
   private double weight;
   
   /* A constructor can be recognised by its special method signature.
      Constructors implicitly return an object instance from the class.
      This means that the data type of the returned object will be the
      sort of data being formed in the class. 
    
      This Fruit class constructor has 5 parameters. One for each of the 
      fields being tracked.
   */
   public Fruit(String c, String te, String ta, double s, double w){
      this.color = c;
      this.texture = te;
      this.taste = ta;
      this.size = s;
      this.weight = w; 
      COUNT+=1;
   }
   
   /* 
      This is another Fruit constructor. It shares the same name as 
      the class as well. Mutiple constructors are legal because 
      the compiler will match the whole method signature when a method is 
      called. You should notice that this constructor method uses three
      Paremeters instead of the five the other uses.
   */
   public Fruit(String c, String te, String ta){
      this.color = c;
      this.texture = te;
      this.taste = ta;
      COUNT+=1;
   }
   
   // getWeight is an accessor or getter. It grabs the information from 
   // the weight field for the current object and returns it.
   // The return type will match the type of the variable the method
   // accesses.
   public double getWeight(){
      return this.weight;
   }
   
   /* 
      setWeight is a setter or mutator. It changes the information stored within
      it accepts one number and if possible sets the field, returning nothing.
      This method has been modified to limit the size of the numbers that may be
      set into the weight field.
   */
   public void setWeight(double w){
       if( w>0 && w<200){
         this.weight = w;
       }else{
          System.out.println("Go away.");
      }
   }
   
   /*
      Toss is an action method or ability that the Fruit class objects will 
      be able to perform. An object of the Fruit class must be instantiated
      before this method can be used.
      Ex: 
      Fruit d = new Fruit("red","mush","sweet");
      d.toss();
   */
      
   public void toss(){
      this.color = "";
      this.texture = "gone";
      this.taste = "";
      this.size = 0.0;
      this.weight = 0.0;
   }
   
   //This is also an accessor, However instead of returning the objects 
   // Instance of the field, it returns the class variable, accesable
   //by all objects of the class.
   public int count(){
      return COUNT;
   }
   
   /* 
      toString is a special method. If it exists when printing objects of this
      class, this method will return a string which the print will spit out.
      If this method does not exist in a class the default toString will be used
      which will produce ClassName@Address.
      
      Custom toString methods allow for custom information on printing from your
      own data types!
      
   */
   public String toString(){
      return this.color + " " + this.texture + " "+ this.taste + 
               " " + this.size + " "+ this.weight;
   }
   
   /*
      mix is an action method or ability that the Fruit class objects will 
      be able to perform. An object of the Fruit class must be instantiated
      before this method can be used. 
      
      mix is an example of two objects of the same class interacting. 
      A new Fruit is made which combines the current fruit, and the
      passed in fruit.
      ex:
      Fruit new = fruit1.mix(fruit2);
   */
   public Fruit mix(Fruit toMix){
      COUNT-=2;
      return new Fruit(this.color +"-"+ toMix.color,
                               "slush",this.taste+"-"+toMix.taste,
                               (this.size+toMix.size)/2,
                               (this.weight+toMix.weight)/2  );
   }
}