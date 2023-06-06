package com.kleberaluizio;

import static com.kleberaluizio.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread(); // instance of a Thread
        anotherThread.setName("== Another Thread ==");
        anotherThread.start(); // .start, enables JVM to run the run method

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementaion of run()!");;
            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from the main thread.");


    }
}

// Anonymous class can be create when you will only run the code once.