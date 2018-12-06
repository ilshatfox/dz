// package ru.kpfu.itis.textsimilarity;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileTextProvider {
    private File input;

//    public FileTextProvider(File input) {
//        this.input = input;
//    }

    // @Override
    public String getText(String fileName) {
        File inp = new File(fileName);
        StringBuilder sb = new StringBuilder();
        Scanner sc = null;
        try {
            sc = new Scanner(inp);
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return sb.toString();
    }

    public ArrayList getFiles(String folderName) {
        File folder = new File(folderName);
        File[] listOfFiles = folder.listFiles();
        ArrayList fileNames = new ArrayList();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String name = listOfFiles[i].getName();
                if (name.contains(".txt")){
                    fileNames.add(name);
                }
            }
        }
        System.out.println(fileNames);
        return fileNames;
    }
}