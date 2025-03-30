package org.example.patterns.creational.singleton;

import lombok.extern.java.Log;

@Log
public class SingletonDemo {
    public static void main(String[] args) throws InterruptedException {
        final KittSingleton kitt1 = KittSingleton.getKitt();
        final KittSingleton kitt2 = KittSingleton.getKitt();

        log.info("\nComparing kitt1 and kitt2...\n");
        Thread.sleep(2000);

        // you can check with debugger, set "kitt2 = new KittSingleton()" during runtime,
        // and following the reference comparison will fail
        if (kitt1 == kitt2) {
            log.info("My chassis is looking good in the mirror, Michael.");
        } else {
            log.info("Which is Kitt and which is Karr?");
        }
    }

}
