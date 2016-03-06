package com.javarush.test.level14.lesson08.bonus01;

import java.util.*;
import java.util.concurrent.*;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
            e = new NullPointerException();
            exceptions.add(e);
            e = new TimeoutException();
            exceptions.add(e);
            e = new BrokenBarrierException();
            exceptions.add(e);
            e = new CancellationException();
            exceptions.add(e);
            e = new ConcurrentModificationException();
            exceptions.add(e);
            e = new RejectedExecutionException();
            exceptions.add(e);
            e = new InvalidPropertiesFormatException("asdf");
            exceptions.add(e);
            e = new IllegalFormatCodePointException(0);
            exceptions.add(e);
            e = new InputMismatchException();
            exceptions.add(e);
        }

        //Add your code here

    }
}
