import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WorkWriteThread extends Thread {
    private ControlObj controlOnj;
    private Writer writer;
    private static Lock lock = new ReentrantLock();

    public WorkWriteThread(ControlObj controlOnj, Writer writer) {
        this.controlOnj = controlOnj;
        this.writer = writer;
    }

    @Override
    public void run() {
        while (!controlOnj.isStop()) {
            synchronized (controlOnj) {
                while (!controlOnj.isProduced()) {
                    try {
                        controlOnj.wait();
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                }

                try {
                    if (!controlOnj.isStop()) {
                        writer.writeV2(controlOnj.ch);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Записал");
                controlOnj.consume();
                controlOnj.notify();
            }
        }
    }

}
