package com.epam.SE3.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Vesdet on 22.10.2015.
 */
public class Task_3 {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        File file = new File("src\\com\\epam\\SE3\\task3\\article.html");
        BufferedReader fin = new BufferedReader(new FileReader(file));
        String line;
        while ((line = fin.readLine()) != null) str.append(line + '\n');
        fin.close();

        System.out.println("Sentances with links to drawings");
        Pattern p = Pattern.compile("([Р-п][р-џР-п,:\\(\\)\\-\\s]+)(\\(ашё. \\d+\\))(.)*(\\.)");
        Matcher m = p.matcher(str);
        while (m.find()){
            System.out.println(m.group());
        }

        System.out.println("\nOrder of pictures");
        p = Pattern.compile("(\\d+)\\.jpg");
        m = p.matcher(str);
        int x, max=0;
        boolean flag = false;
        while (m.find()){
            x = Integer.parseInt(m.group(1));
            if (x != ++max) {
                System.out.println("Error!");
                flag = true;
                break;
            }
        }
        if (flag == false) System.out.println("ALLGOOD!!!");
    }
}
