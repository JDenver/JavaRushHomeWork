package com.javarush.test.level15.lesson12.home05;

/**
 * Created by denve on 29.02.2016.
 */
public class SubSolution extends Solution
{
    public SubSolution()
    {
    }

    public SubSolution(int a)
    {
        super(a);
    }

    public SubSolution(double a)
    {
        super(a);
    }

    protected SubSolution(int a, int b)
    {
        super(a, b);
    }

    protected SubSolution(double a, double b)
    {
        super(a, b);
    }

    protected SubSolution(int a, double b)
    {
        super(a, b);
    }

    SubSolution(double a, int b)
    {
        super(a, b);
    }

    SubSolution(String s)
    {
        super(s);
    }

    SubSolution(String s, int a)
    {
        super(s, a);
    }

    private SubSolution(float a) {}
    private SubSolution(float a, int b) {}
    private SubSolution(int a, float b) {}
}
