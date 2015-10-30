package com.epam.SE4.task4;

import com.epam.SE2.task3_and_task4.PaperItem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Library implements Serializable {
    private String title;
    private List<Film> films = new ArrayList<>();
    private List<Pair> pairs = new ArrayList<>();

    public Library(String title) {
        this.title = title;
    }

    public void addFilm(Film film) {
        films.add(film);
        for (Actor x : film.actors) {
            Pair pair = new Pair(x, film);
            pairs.add(pair);
        }
    }

    public void filmsWithActor(Actor actor) {
        StringBuilder tmp = new StringBuilder();
        for (Pair x: pairs) {
            if (x.getActor() == actor) tmp.append(x.getFilm());
        }
        System.out.println("Actor: " + actor.getName() + "\nFilms:\n" + tmp);
    }

    public void deleteFilm(Film film) {
        films.remove(films.indexOf(film));
        ListIterator<Pair> iter = pairs.listIterator();
        while (iter.hasNext()) {
            if (iter.next().getFilm() == film) iter.remove();
        }
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for (Film x : films) {
            tmp.append(x);
        }
        return "Library:\"" + title + "\"\nFilms:\n" + tmp;
    }

    public static void serializeToFile(Library library, File outputFile) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Library deserializeFromFile(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Library) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
