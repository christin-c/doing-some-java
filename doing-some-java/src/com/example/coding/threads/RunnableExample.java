package com.example.coding.threads;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread #2: "+i);
            try {
                // pause for 1 sec
                Thread.sleep(1000); // main Thread sleeps for 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("#2 finished");
    }
}
