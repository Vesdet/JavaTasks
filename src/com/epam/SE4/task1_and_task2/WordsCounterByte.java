package com.epam.SE4.task1_and_task2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vesdet on 29.10.2015.
 */
public class WordsCounterByte {
    Map<String, Integer> map = new HashMap<>();
    private final int A = 65;
    private final int Z = 90;
    private final int a = 97;
    private final int z = 122;

    public WordsCounterByte(String path) {
        addWordsToMap();
        numberOfUsedWordsInFile(path);
    }

    private void addWordsToMap() {
        File file = new File("src\\com\\epam\\SE4\\task1_and_task2\\javaWords.txt");
        try (InputStream inputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            String tmp = "";
            int sym;
            while (true) {
                sym = bufferedInputStream.read();
                if (sym == -1) break;
                if ((sym >= a && sym <= z) || (sym >= A && sym <= Z)) {
                    tmp += (char) sym;
                } else {
                    if (tmp.compareTo("")!=0) map.put(tmp, 0);
                    tmp = "";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void numberOfUsedWordsInFile(String path) {
        File file = new File(path);
        try (InputStream inputStream = new FileInputStream(file);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            String tmp = "";
            int sym;
            while (true) {
                sym = bufferedInputStream.read();
                if (sym == -1) break;
                if ((sym >= a && sym <= z) || (sym >= A && sym <= Z)) {
                    tmp += (char) sym;
                } else {
                    if (tmp.compareTo("")!=0) findWords(tmp);
                    tmp = "";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findWords(String tmp) {
        for (String x : map.keySet()) {
            if (tmp.compareTo(x) == 0) {
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

    public void printToFileWithStream(File output) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(output);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)) {
            for (String x : map.keySet()) {
                if (map.get(x) != 0) {
                    String tmp = x + " - " + map.get(x) + '\n';
                    byte[] b = tmp.getBytes();
                    bufferedOutputStream.write(b, 0, b.length);
                }
            }
        }
    }
}
