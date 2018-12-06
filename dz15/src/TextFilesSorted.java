// package ru.kpfu.itis.textsimilarity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFilesSorted {
    public void processFilesFromFolder(File folder)
    {
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            System.out.println(entry);
            if (entry.isDirectory()) {
                processFilesFromFolder(entry);
                continue;
            }
            // иначе вам попался файл, обрабатывайте его!
        }
    }
}