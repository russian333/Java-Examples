package colemanBrody;

/**
 * Created by Brody on 7/11/2016.
 */
public class myClass {

    private String name = "";
    private String desc = "";
    private int age = 0;

    public myClass(String n, String d, int a){
        this.name = n;
        this.desc = d;
        this.age = a;
    }
    @Override
    public String toString(){
        return this.name + " has a description of: \n" +this.desc + "\n and an age of "+this.age+".";
    }

    public String getName(){
        return this.name;
    }

}
