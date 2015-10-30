package com.epam.SE4.task4;

import java.io.Serializable;

/**
 * Created by Vesdet on 30.10.2015.
 */
public class Pair implements Serializable {
    private Actor actor;
    private Film film;

    public Pair(Actor actor, Film film) {
        this.actor = actor;
        this.film = film;
    }

    public Actor getActor() {
        return actor;
    }

    public Film getFilm() {
        return film;
    }
}
