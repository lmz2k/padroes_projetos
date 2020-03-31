package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton a = Singleton.getInstance();

        System.out.println("Singleton foi instanciado : " + Singleton.instanceCounter + " Vez(es)");
        Singleton b = Singleton.getInstance();
        Singleton c = Singleton.getInstance();


        System.out.println("Singleton foi instanciado : " + Singleton.instanceCounter + " Vez(es)");

    }

}
