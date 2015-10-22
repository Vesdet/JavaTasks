package com.epam.SE5.task1;

import java.util.Scanner;

/**
 * Created by Vesdet on 22.10.2015.
 */
public class Task_1 {
    public static void main(String[] args) {
        String str;
        boolean flag = true;
        try (Scanner in = new Scanner(System.in)) {
            while (flag) {
                System.out.println(WorkWithFiles.getPath());
                System.out.println("Enter a command");
                switch (in.next()) {
                    case "setPath": {
                        System.out.println("Enter a path to file or catalog");
                        WorkWithFiles.setPath(in.next());
                        break;
                    }
                    case "open": {
                        str = WorkWithFiles.readFile();
                        System.out.println(str);
                        break;
                    }
                    case "write": {
                        System.out.println("Enter a text");
                        str = in.next();
                        WorkWithFiles.writeToFile(str);
                        break;
                    }
                    case "clearAndWrite": {
                        System.out.println("Enter a text");
                        str = in.next();
                        WorkWithFiles.clearAndWriteToFile(str);
                        break;
                    }
                    case "createFile": {
                        WorkWithFiles.createFile();
                        break;
                    }
                    case "deleteFile": {
                        WorkWithFiles.deleteFile();
                        break;
                    }
                    case "catalog": {
                        str = WorkWithFiles.catalog();
                        System.out.println(str);
                        break;
                    }
                    case "exit": {
                        flag = false;
                        break;
                    }
                    default:{
                        System.out.println("Error command");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
