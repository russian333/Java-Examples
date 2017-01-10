package colemanBrody;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ArrayList<myClass> alMC = new ArrayList<myClass>();
        myClass myName = new myClass("Brody","Home-schooled, Computer nerd.",25);
        myClass bobName = new myClass("Bob","Construction Worker",40);
        alMC.add(myName);
        alMC.add(bobName);


        Pair<String,myClass> pairup = new Pair<>("Brody",myName);
        System.out.println(pairup.getFirst()+"\n"+pairup.getPair()+"\n");


        HashMap<String,myClass> lookup = new HashMap<>();
        for(myClass d:alMC){
            lookup.put(d.getName(),d);
        }
        System.out.println(lookup.get("Bob"));
    }
}
