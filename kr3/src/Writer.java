import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private FileWriter file;
    private String fileName;

    public Writer(String fileName) throws IOException {
        this.fileName = fileName;
        this.file = new FileWriter(fileName);
    }
    public void write(char writeFile) throws IOException {
        file.write(writeFile);
    }

    public static void write(String fileName, char writeFile) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName)));
        FileWriter file = new FileWriter(fileName, true);
        file.write(writeFile);
        file.close();
    }

    public void writeV2(char writeFile) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName)));
        FileWriter file = new FileWriter(fileName, true);
        file.write(writeFile);
        file.close();
    }

    public void close() throws IOException {
        file.close();
    }
}
