package com.epam.SE4.task1_and_task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vesdet on 29.10.2015.
 */
public class WordsCounterSymbol {
    Map<String, Integer> map = new HashMap<>();

    public WordsCounterSymbol(String path) {
        addWordsToMap();
        numberOfUsedWordsInFile(path);
    }

    private void addWordsToMap() {
        File file = new File("src\\com\\epam\\SE4\\task1_and_task2\\javaWords.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String tmp;
            while (true) {
                tmp = bufferedReader.readLine();
                if (tmp == null) break;
                map.put(tmp, 0);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void numberOfUsedWordsInFile(String path) {
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String tmp;
            while (true) {
                tmp = bufferedReader.readLine();
                if (tmp == null) break;
                findWords(tmp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File don't found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findWords(String tmp) {
        for (String x : map.keySet()) {
            Pattern p = Pattern.compile(x+"[ \\{\\(;\\)\\}]");
            Matcher m = p.matcher(tmp);
            while (m.find()) {
                map.put(x, map.get(x) + 1);
            }
        }
    }

    public void printAll() {
        for (String x : map.keySet()) {
            if (map.get(x) != 0) {
                System.out.println(x + "    " + map.get(x));
            }
        }
    }

    public void printToFileWithWriter(File output) throws IOException {
        try (Writer writer = new FileWriter(output);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (String x : map.keySet()) {
                if (map.get(x) != 0) {
                    String tmp = x + " - " + map.get(x) + '\n';
                    bufferedWriter.write(tmp, 0, tmp.length());
                }
            }
        }
    }
}
