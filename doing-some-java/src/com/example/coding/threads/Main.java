package com.example.coding.threads;

// Multithreading
public class Main {
    /*
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution
    	 */
    public static void main(String[] args) throws InterruptedException {
        // first way creating a thread
        ThreadExample thread1 = new ThreadExample();
        // thread 1 is a daemon
        thread1.setDaemon(true);
        System.out.println("#1 is deamon?: " + thread1.isDaemon());
        System.out.println("active Threads: " + Thread.activeCount());

        // other way of creating a thread
        RunnableExample runnable1 = new RunnableExample();
        Thread thread2 = new Thread(runnable1);
        thread2.setPriority(3);
        System.out.println("#2 priority: " + thread2.getPriority());
        thread1.start();

        // thread2 starts after thread is finished
        // thread1.join();

        // waits 3 sec before thread 2 starts
        thread1.join(3000);

        thread2.start();
    }
}
