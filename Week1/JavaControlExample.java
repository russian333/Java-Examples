package com.company;


import java.util.Arrays;

public class JavaControlExample {
    static int[] theChosen = {0,1,1,2,3,5,8,13,21,34,55,89};
    public static void printAll(int[] intArray){
        for(int eachInt:intArray){
            System.out.println(eachInt);
        }
    }
    public static int returnN(int n){
        try{
            return theChosen[n];
        }catch(Exception E) {
            System.out.println("There is not a number at index:" + n + ".");
        }
        return -1;
    }
    public static void printEven(int[] ints){
        int countInts = ints.length;
        for(int i=0;i<countInts;i++){
            if(ints[i]%2==0)
                System.out.println(ints[i] +" is even.");
        }
    }
    public static void printEvenOrOdd(int[] ints){
        int countInts = ints.length;
        for(int i=0;i<countInts;i++){
            if(ints[i]%2==0) {
                System.out.println(ints[i] + " is even.");
            }else{
                System.out.println(ints[i] + " is odd.");
            }
        }
    }
    public static int sumInts(int[] ints){
        int i=0;
        int total = 0;
        while(i<ints.length){
            total+=ints[i];
        }
        return total;
    }
    public static int[] insertInt(int num,int location){
        int[] newone = new int[theChosen.length+1];
        for(int x=0;x<location+1;x++){
            newone[x]=theChosen[x];
        }
        newone[location]=num;
        for(int y = location+1;y<newone.length;y++){
            newone[y]=theChosen[y-1];
        }
        return newone;
    }
    public static void main(String[] args) {
        printAll(insertInt(65,3));

    }
}
