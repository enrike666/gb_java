package com.company.Lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("кино");
        words.add("гонка");
        words.add("кино");
        words.add("поиск");
        words.add("месяц");
        words.add("статья");
        words.add("девушка");
        words.add("история");
        words.add("жизнь");
        words.add("имя");
        words.add("поиск");
        words.add("кино");
        words.add("элемент");
        words.add("вор");
        words.add("трава");

        HashMap<String, Integer> mapWordsCount = new HashMap<>();

        for (String word : words) {
            if (mapWordsCount.containsKey(word)) {
                mapWordsCount.put(word, mapWordsCount.get(word) + 1);
            } else {
                mapWordsCount.put(word, 1);
            }
        }

        ArrayList<String> uniqueWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : mapWordsCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }

        System.out.println("Кол-во уникальных слов: " + uniqueWords.size());
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Кол-во каждого слова: ");
        System.out.println(mapWordsCount);
    }
}
