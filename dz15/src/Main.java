//package ru.kpfu.itis.textsimilarity;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
////        System.out.println("123123123");
//        FileTextProvider file = new FileTextProvider();
//        String file2 = file.getText("1.txt");
//        System.out.println(file2);
//        TextFilesSorted f = new TextFilesSorted();
//        f.processFilesFromFolder("txtFiles");

        FilesAnalyzer name = new FilesAnalyzer();
        Map file = name.getAnalizeNums("txtFiles", "jacc", "mainTxt.txt", "n");
        System.out.println(file);
        ArrayList files = name.sortedMap(file);
        System.out.println(files);


        String filesFolder = "txtFiles";

        boolean a = true;
        Scanner in = new Scanner(System.in);
        while (a==true) {
            System.out.println("_______________" +
                    "\nСравнить 2 файла или много файлов?" +
                    "\n1 - Выход" +
                    "\n2 - 2 файла" +
                    "\n3 - Много файлов" +
                    "\n_______________" +
                    "\nВаш выбор:");
            int choice = in.nextInt();
            if (choice == 1) {
                a = false;
            } else if (choice == 2) {
                Main.jacCos();
            } else if (choice == 3) {
                Main.muchFiles();
            }
        }




    }

    public static void jacCos() {
        FileTextProvider file = new FileTextProvider();

        TextAnalyzer jacc = new JaccardTextAnalyzer();
        TextAnalyzer cos = new CosTextAnalyzer();
        String s1 = file.getText("1.txt");
        String s2 = file.getText("2.txt");

        boolean a = true;
        Scanner in = new Scanner(System.in);
        while (a == true) {
            System.out.println(
                    "_______________" +
                            "\nСравнить по Джакарду или по Косинусной мере?" +
                            "\n1 - Выход" +
                            "\n2 - Джакард" +
                            "\n3 - Косинусная мера" +
                            "\n_______________" +
                            "\nВаш выбор:");
            int choice = in.nextInt();
            if (choice == 1) {
                a = false;
            } else if (choice == 2) {
                double coefJacc = jacc.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
                System.out.println("Коэффициент схожести по Джакарду: " + coefJacc);
            } else if (choice == 3) {
                double coefCos = cos.analyze(new SimpleTextProvider(s1), new SimpleTextProvider(s2));
                System.out.println("Коэффициент схожести по Косинусной мере: " + coefCos);
            }
        }
    }

    public static void muchFiles() {
        FileTextProvider file = new FileTextProvider();

        TextAnalyzer jacc = new JaccardTextAnalyzer();
        TextAnalyzer cos = new CosTextAnalyzer();
        String s1 = file.getText("1.txt");
        String s2 = file.getText("2.txt");

        boolean a = true;
        Scanner in = new Scanner(System.in);
        while (a == true) {
            System.out.println(
                    "_______________" +
                            "\nСравнить по Джакарду или по Косинусной мере?" +
                            "\n1 - Выход" +
                            "\n2 - Джакард" +
                            "\n3 - Косинусная мера" +
                            "\n_______________" +
                            "\nВаш выбор:");
            int choice = in.nextInt();
            System.out.println(
                    "_______________" +
                            "\nУчитывать имя файла?" +
                            "\n1 - Да" +
                            "\n2 - Нет" +
                            "\n_______________" +
                            "\nВаш выбор:");
            int choice2 = in.nextInt();
            String ans;
            if (choice2 == 1) {
                ans = "y";
            } else {
                ans = "n";
            }

            FilesAnalyzer name = new FilesAnalyzer();
            if (choice == 1) {
                a = false;
            } else if (choice == 2) {
                Map analize = name.getAnalizeNums("txtFiles", "jacc", "mainTxt.txt", ans);
                System.out.println(file);
                ArrayList files = name.sortedMap(analize);
                System.out.println("Вот список:" + files);
            } else if (choice == 3) {
                Map analize = name.getAnalizeNums("txtFiles", "cos", "mainTxt.txt", ans);
                System.out.println(file);
                ArrayList files = name.sortedMap(analize);
                System.out.println("Вот список:" + files);
            }
        }
    }
}