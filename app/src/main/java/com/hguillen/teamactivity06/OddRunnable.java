package com.hguillen.teamactivity06;

public class OddRunnable implements Runnable {
    // Start loop for odd numbers with delay (Thread.sleep()) between each print
    @Override
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);

            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
