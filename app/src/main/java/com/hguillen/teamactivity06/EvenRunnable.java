package com.hguillen.teamactivity06;

public class EvenRunnable  implements Runnable {
    // Start loop for even numbers with delay (Thread.sleep()) between each print
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
