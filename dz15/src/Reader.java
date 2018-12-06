//package ru.kpfu.itis.textsimilarity;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;
public class Reader{
    public List reader(String fileName) {
//        // fileName = "1.txt";
//        // String txtFile = "";
//        File file = new File(fileName);
//
//        try {
//
//            Scanner sc = new Scanner(file);
//            ListIterator<String> it = new ListIterator<String>[];
//            while (sc.hasNext()) {
//                // int i = sc.nextInt();
//                System.out.println(sc.nextLine());
//            }
//            sc.close();
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        List<String> txtFile = new ArrayList<String>();
//        return txtFile;
//        try {
//            // Files.lines(Paths.get(fileName), StandardCharsets.UTF_8).forEach(System.out::println);
//            List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
//            System.out.println(lines.size());
//            for (String line: lines) {
//                System.out.println(line);
//            }
//            return lines;
//        } catch (IOException e) {
//            System.out.println("sdasdfasdf");
//            List<String> lines =
//        }
        //?String txt = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), Charset.forName("UTF-8")));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println((line));
            }
        } catch (FileNotFoundException e) {
            //
        } catch (IOException e) {
            //
        } finally {
            if (reader !=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //
                }
            }
        }
        List<String> txtFile = new ArrayList<String>();
        return txtFile;
    }
}
