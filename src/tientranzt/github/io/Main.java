package tientranzt.github.io;

import static tientranzt.github.io.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "hello in main thread");
        Thread1 t1 = new Thread1();
        t1.setName("Thread 1");

        t1.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "anonymous class in main thread");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_PURPLE + "Thread 2 implements from interface runnable");

//                if thread is not sleep or wait it set interup to true, else raising InterruptedException
                t1.interrupt();

//                join method make another thread wait until it done
//                try {
//                    t1.join();
//                    System.out.println(ANSI_PURPLE + "Thread 2 implements from interface runnable");
//                } catch (InterruptedException e) {
//                    System.out.println("t1 join error");
//                }
            }
        }).start();



        System.out.println(ANSI_RED + "hello again in main thread");
    }
}


