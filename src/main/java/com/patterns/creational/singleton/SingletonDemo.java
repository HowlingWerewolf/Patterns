package com.patterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        KittSingleton kitt1 = KittSingleton.getKitt();
        KittSingleton kitt2 = KittSingleton.getKitt();

        System.out.println("\nComparing kitt1 and kitt2...\n");
        Thread.sleep(2000);

        // you can check with debugger, set "kitt2 = new KittSingleton()" during runtime,
        // and following the reference comparison will fail
        if (kitt1 == kitt2) {
            System.out.println("My chassis is looking good in the mirror, Michael.");
        } else {
            System.out.println("Which is Kitt and which is Karr?");
        }
    }

}
