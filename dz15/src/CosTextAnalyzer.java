//package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class CosTextAnalyzer implements TextAnalyzer{
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        // te1 главный файл, te2 сравниваем с te1
        List<String> list1 = tokenize(te1.getText());
        List<String> list2 = tokenize(te2.getText());
        return CosSimilarity(list1, list2);
    }

    /**
     * Returns a list of unique words found in an input text.
     * Words in the text can be delimited by one space or a space with a comma
     */
    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            uniqueWords.add(word);
        }
        //    word = word.toLowerCase();
        //    if (!uniqueWords.contains(word))
        //        uniqueWords.add(word);
        //}
        return uniqueWords;
    }

    /**
     * Calculates Jaccard similarity between two lists of unique string.
     * Returns the value of coefficient.
     */
    private double CosSimilarity(List<String> l1, List<String> l2) {
        Map<String,Integer> dict1 = countWords(l1); // Считаем количество слов
        Map<String,Integer> dict2 = countWords(l2); // Считаем количество слов
        Map<String,Integer> dict3 = findWords(dict1, dict2); // Выделяем слова которые и там и там
        Map<String,Integer> dict4 = findWords(dict2, dict1); // Выделяем слова которые и там и там

        int num1 = 0; // Ищем числитель формулы
        for (String word: dict3.keySet()) {
            int i = dict3.get(word) * dict4.get(word);
            num1 += i;
        }

        double num2 = sqtrMap(dict3);
        double num3 = sqtrMap(dict4);

        return (double) num1/(num2*num3);
    }
    private Map<String,Integer> countWords(List<String> words) {
        Map<String,Integer> dict1 = new HashMap<String,Integer>();
        for (String word : words) {
            if (dict1.containsKey(word)) {
                Integer num = dict1.get(word);
                num += 1;
                dict1.put(word, num);
            } else {
                dict1.put(word, 1);
            }
        }
        return dict1;
    }
    private Map<String,Integer> findWords(Map<String,Integer> words1, Map<String,Integer> words2) {
        Map<String,Integer> dict1 = new HashMap<String,Integer>();
        for (String word : words1.keySet()) {
            if (words2.containsKey(word)) {
                dict1.put(word, words1.get(word));
            }
        }
        return dict1;
    }
    private double sqtrMap(Map<String,Integer> words) {
        int num1 = 0;
        for (String word: words.keySet()) {
            int i = words.get(word) * words.get(word);
            num1 += i;
        }
        return Math.sqrt(num1);
    }
}