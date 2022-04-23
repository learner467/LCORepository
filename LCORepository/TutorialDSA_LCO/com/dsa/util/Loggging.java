package com.dsa.util;

public class Loggging {

    public static void log(String className, String method,String message){
        System.out.println("    "+ className+":"+method+"::"+message);
    }

    public static void lineBreak(){
        System.out.println("\n");
    }

    public static void lineBreak(int n){
        if(n>0)
        lineBreak(n-1);
        System.out.println();
    }
}
