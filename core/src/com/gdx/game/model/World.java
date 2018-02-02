package com.gdx.game.model;

import java.util.ArrayList;
import java.util.Iterator;

public class World implements Iterable<GameElement>{
    private int height, width;
    private Maze labyrinthe;
    private Pacman pacman;

    public World()
    {

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Maze getLabyrinthe() {
        return labyrinthe;
    }

    public Pacman getPacman() {
        return pacman;
    }

    @Override
    public Iterator<GameElement> iterator() {
        ArrayList<GameElement> l = new ArrayList<GameElement>();
        return l.iterator();
    }
}
