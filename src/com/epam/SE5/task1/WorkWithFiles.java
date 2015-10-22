package com.epam.SE5.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

/**
 * Created by Vesdet on 22.10.2015.
 */
public class WorkWithFiles {
    private static Path path;

    public static Path getPath() {
        return path;
    }

    public static void setPath(String path) {
        WorkWithFiles.path = Paths.get(path);
    }

    public static String readFile() {
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader =
                     Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append("\n"+line);
            }
            reader.close();
            return str.toString();
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (NoSuchFileException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeToFile(String str) {
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.APPEND)) {
            writer.write(str);
            writer.close();
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (NoSuchFileException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearAndWriteToFile(String str) {
        try (BufferedWriter writer =
                     Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.write(str);
            writer.close();
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (NoSuchFileException e){
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileName(){
        return path.getFileName().toString();
    }

    public static String catalog(){
        StringBuilder str = new StringBuilder();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry: stream) str.append(entry.getFileName() + "\n");
        } catch (NotDirectoryException e) {
            System.out.println("It's file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

    public static void createFile() {
        try {
            Path file = Files.createFile(path);
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        try {
            Files.delete(path);
        } catch (AccessDeniedException e) {
            System.out.println("It's not file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
