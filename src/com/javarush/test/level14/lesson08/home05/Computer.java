package com.javarush.test.level14.lesson08.home05;

/**
 * Created by denve on 23.02.2016.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Keyboard getKeyboard()
    {

        return keyboard;
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Computer()
    {
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor = new Monitor();
    }


}
