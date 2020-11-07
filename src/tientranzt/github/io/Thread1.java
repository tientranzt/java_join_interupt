package tientranzt.github.io;

import static tientranzt.github.io.ThreadColor.ANSI_BLACK;
import static tientranzt.github.io.ThreadColor.ANSI_BLUE;

public class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            sleep(3000);
            System.out.println(ANSI_BLUE + "Thread1 is running with name " + ANSI_BLACK + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
        }
        System.out.println(ANSI_BLUE + "3 minutes pass and i wake up");

    }
}
