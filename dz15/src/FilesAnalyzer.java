//package ru.kpfu.itis.textsimilarity;

import java.util.*;


/**
 * Entity, representing a text
 */
public class FilesAnalyzer {

    public Map<String, Double> getAnalizeNums(String filesFolder, String method, String mainFileName, String testName) {
        // Читает анализирует и возвращает ключ-значения: имя текстовика - значение
        // filesFolder путь, method jacc или cos, имя главного файла mainFileName,
        // testName y/n(учитывать или нет имя файла)
        FileTextProvider file = new FileTextProvider();
        ArrayList txtFiles = file.getFiles(filesFolder); // Получили имена файлов
        // txtFiles.remove(mainFileName);

        TextAnalyzer jacc = new JaccardTextAnalyzer();
        TextAnalyzer cos = new CosTextAnalyzer();

        Map<String,Double> analizeNumsKey = new HashMap<String,Double>();
        Map<String,String> textNameValue = new HashMap<String,String>(); // имя файла - текст внутри

        String mainText = file.getText(filesFolder + "/" + mainFileName);
        if (testName.equals("y")) { // Если учитывать имя файла Костыль
            mainText += "\n" + mainFileName;
        }
        for (int i=0; i < txtFiles.size(); i++) {
            String fileName = txtFiles.get(i).toString();
            String text = file.getText(filesFolder + "/" + fileName);
            if (testName.equals("y")) { // Если учитывать имя файла Костыль
                text += "\n" + fileName;
            }
            textNameValue.put(fileName, text);
        }
        if (method.equals("jacc")) { // костыль
            for (int i=0; i < txtFiles.size(); i+=1) {
                String obj = textNameValue.get(txtFiles.get(i)).toString();
                double analizeNum = jacc.analyze(new SimpleTextProvider(mainText), new SimpleTextProvider(obj));
                analizeNumsKey.put(txtFiles.get(i).toString(), analizeNum);
            }
        } else {
            for (int i=0; i < txtFiles.size(); i+=1) {
                String obj = textNameValue.get(txtFiles.get(i)).toString();
                double analizeNum = cos.analyze(new SimpleTextProvider(mainText), new SimpleTextProvider(obj));
                analizeNumsKey.put(txtFiles.get(i).toString(), analizeNum);
            }
        }

        analizeNumsKey.remove(mainFileName);

        return analizeNumsKey;
    }

    public ArrayList sortedMap(Map<String, Double> file) {
        // Сортирует и возращает ArrayList с именами файлов
        Map<Double,String> sortNums = new HashMap<Double,String>(); // Повернули ключ - значение
        ArrayList<Double> nums = new ArrayList<>(); // Список со значениями схожести
        ArrayList<String> sortNameFiles = new ArrayList<>(); // Отсортированный список
        for (String word: file.keySet()) {
            double i = file.get(word);
            boolean test = sortNums.containsKey(i);
            if (test) { // Если файл уже содержится, то к тому что содержится добавляем еще
                String w = sortNums.get(i);
                w += "\n" + word;
                sortNums.put(i, w);
            } else {
                sortNums.put(i, word);
                nums.add(i);
            }

        }
        Collections.sort(nums);
        Collections.reverse(nums);

        for (double num: nums) {
            String i = sortNums.get(num);
            String[] wordsFile = i.split("\n");
            // System.out.println(wordsFile);
            for (String word: wordsFile) {
                sortNameFiles.add(word);

            }
        }

        return sortNameFiles;

    }


}