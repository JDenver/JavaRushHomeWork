package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

/**
 * Created by denve on 06.03.2016.
 */
public class Snake
{
    private static ArrayList<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;
    private int x, y;

    public Snake(int x, int y)
    {
        this.x = x;
        this.y = y;
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public void move() {

    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public ArrayList<SnakeSection> getSections()
    {
        return sections;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public SnakeDirection getDirection()
    {
        return direction;
    }

    public void setDirection(SnakeDirection direction)
    {
        this.direction = direction;
    }
}
