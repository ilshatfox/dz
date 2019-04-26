import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WorkReadThread extends Thread{
    private ControlObj controlOnj;
    private Reader reader;
    private static Lock lock = new ReentrantLock();

    public WorkReadThread(ControlObj controlOnj, Reader reader) {
        this.controlOnj = controlOnj;
        this.reader = reader;
    }

    @Override
    public void run() {
        while (!controlOnj.isStop()) {
            synchronized (controlOnj) {
                while (!controlOnj.isConsumed()) {
                    try {
                        controlOnj.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }

                try {
                    int ch = reader.getChar();
                    if (ch != -1) {
                        controlOnj.ch = (char) ch;
                    } else {
                        controlOnj.stop();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Прочитал");
                controlOnj.produce();
                controlOnj.notify();
            }
        }
    }
}
