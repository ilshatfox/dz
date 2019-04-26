import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Reader {
    public static String read(String fileName) throws IOException {
        String allFiles = "";
        InputStream is = new FileInputStream(fileName);
        Scanner sc = new Scanner(is);
        int i;
        StringBuilder a = new StringBuilder();
        while ((i = is.read()) != -1) {
            a.append((char) i);
//            System.out.println(a);
//            a  = (String) a;
        }
        return a.toString();
    }
}
