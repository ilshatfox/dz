//package ru.kpfu.itis.textsimilarity;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("123123123");
//        FileTextProvider file = new FileTextProvider();
//        String file2 = file.getText("1.txt");
//        System.out.println(file2);
        TextFilesSorted f = new TextFilesSorted();
        f.processFilesFromFolder("txtFiles");



        TextAnalyzer jacc = new JaccardTextAnalyzer();
        TextAnalyzer cos = new CosTextAnalyzer();
        String txtName1 = "123.txt";
        String txtName2 = "123.txt";
        String s1 = "Мама мыла раму, а я я ничего не делал делал";
        String s2 = "Я я совсем ничего не делал";

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
}