import java.io.*;
import java.util.Scanner;

public class Reader {
    private String fileName;
    private  InputStream file;
    private Scanner sc;

    public Reader(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.file = new FileInputStream(fileName);
        this.sc = new Scanner(this.file);

    }
    public static String readAll(String fileName) throws IOException {
        InputStream is = new FileInputStream(fileName);

        int i;
        StringBuilder a = new StringBuilder();
        while ((i = is.read()) != -1) {
            a.append((char) i);
        }
        return a.toString();
    }

    public int getChar() throws IOException {
        return file.read();
    }
}
