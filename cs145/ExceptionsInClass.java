package edu.whatcom.colemanBrody;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            throwMe();
        } catch (Exception e) {
            StackTraceElement[] g = e.getStackTrace();
            System.out.println(Arrays.toString(g));
            System.out.print(g[1]);
            System.out.println(e.getCause().toString());
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }
    public static void throwMe() throws Exception{
        throw new Exception("I am a test Exception");

    }
}
