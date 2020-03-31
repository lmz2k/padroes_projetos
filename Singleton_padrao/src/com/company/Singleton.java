package com.company;

public class Singleton {


    private static Singleton single_instance = null;
    public static int instanceCounter = 0;


    private Singleton() {
    }


    public static Singleton getInstance() {
        instanceCounter += 1;

        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }


}
