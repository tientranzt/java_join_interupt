package tientranzt.github.io;
import static tientranzt.github.io.ThreadColor.*;
public class Thread2Runable implements Runnable{
    @Override
    public void run() {
        System.out.println( ANSI_PURPLE + "Thread 2 implements from interface runnable");
    }
}
