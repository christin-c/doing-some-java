package com.example.coding.threads;

public class ThreadExample extends Thread{
    @Override
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println("Thread #1: "+i);
            try {
                // pause for 1 sec
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("#1 finished");
    }
}
