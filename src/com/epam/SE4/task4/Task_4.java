package com.epam.SE4.task4;

import java.io.File;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Task_4 {
    public static void main(String[] args) {
        Actor diesel = new Actor("Vin Diesel");
        Actor leslie = new Actor("Rose Leslie");
        Actor walker = new Actor("Paul Walker");
        Actor johnson = new Actor("Dwayne Johnson");
        Actor brewster = new Actor("Jordana Brewster");

        Film hunter = new Film("The Last Witch Hunter", 2015);
        Film riddick = new Film("The Chronicles of Riddick", 2004);
        Film good = new Film("Now Is Good", 2012);
        Film fast = new Film("Fast Five", 2011);
        Film below = new Film("Eight Below", 2005);

        hunter.addActor(diesel);
        hunter.addActor(leslie);

        fast.addActor(diesel);
        fast.addActor(walker);
        fast.addActor(johnson);
        fast.addActor(brewster);

        riddick.addActor(diesel);
        good.addActor(leslie);
        below.addActor(walker);

        Library myLibrary = new Library("MyLibrary");
        myLibrary.addFilm(hunter);
        myLibrary.addFilm(riddick);
        myLibrary.addFilm(good);
        myLibrary.addFilm(fast);
        myLibrary.addFilm(below);

      //  myLibrary.filmsWithActor(diesel);
        System.out.println(myLibrary);
        myLibrary.deleteFilm(fast);
        System.out.println(myLibrary);
        myLibrary.filmsWithActor(diesel);

        File file = new File("src\\com\\epam\\SE4\\task4\\serialized");
        Library.serializeToFile(myLibrary, file);
        Library lib = null;
        lib = Library.deserializeFromFile(file);
        System.out.println(lib);
    }
}
