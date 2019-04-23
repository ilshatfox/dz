

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {
    private int start;
    private int end;
    private int[] arr;
    private static Lock lock = new ReentrantLock();

    public CounterThread(int start, int end, int[] arr) {
        this.start = start;
        this.end = end;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            lock.lock();
            Main.sum += arr[i];
            lock.unlock();
        }
    }
}
