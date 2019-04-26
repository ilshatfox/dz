import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader("input.txt");
        Writer w = new Writer("output.txt");

        ControlObj cont = new ControlObj("r");

        Thread t1 = new WorkReadThread(cont, r);
        Thread t2 = new WorkWriteThread(cont, w);

        t1.start();
        t2.start();

    }
}
