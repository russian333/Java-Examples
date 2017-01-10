package edu.ctc.whatcom.colemanBrody;

/**
 * Created by bcoleman 
 * on 7/13/2016.
 * Example Thread definitions. Also includes and example of running two of the defined threads.
 * CS145
 **/
public class myThreads {

    public static void main(String[] args){
    // Defines a runnable. Runs 6000 iterations printing every iteration. 
    // Uses thread numbering int y
        Runnable myRun = new Runnable() {
            int y = 0;
            @Override
            public void run() {
                for(int x = 0;x<6000;x++){
                    System.out.println("Thread " + y+" is on iteration "+x+"");
                }
            }
        };
        Runnable myRun2 = new Runnable() {
            int y = 1;
            @Override
            public void run() {
                for(int x = 0;x<6000;x++){
                    System.out.println("Thread " + y+" is on iteration "+x+"");
                }
            }
        };
        Thread first = new Thread(myRun);
        Thread second = new Thread(myRun2);
        first.start();
        second.start();

    }
}
