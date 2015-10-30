package com.epam.SE4.task4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Film implements Serializable {
    private String title;
    private int year;
    public List<Actor> actors = new ArrayList<>();

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public void addActors(ArrayList<Actor> actors) {
        this.actors.addAll(actors);
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        StringBuilder tmp = new StringBuilder();
        for (Actor x : actors) {
            tmp.append(x.info());
        }
        System.out.println("Title: \"" + title + "\"    Year:" + year +"\nActors:\n" + tmp);
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"    Year:" + year + '\n';
    }
}
