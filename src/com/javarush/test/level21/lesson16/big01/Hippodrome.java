package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by denve on 06.03.2016.
 */
public class Hippodrome
{
    private static ArrayList<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException
    {
        for (int i = 1; i <= 100 ; i++)
        {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move() {
        for (int i = 0; i < horses.size(); i++)
        {
            horses.get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < horses.size(); i++)
        {
            horses.get(i).print();
            System.out.println("\n\n");
        }
    }

    public static Horse getWinner() {
        Horse winner = new Horse(null, 0 ,0);
        int max = (int) Math.round(horses.get(0).getDistance());
        for (int i = 1; i < horses.size(); i++)
        {
            if ((int) Math.round(horses.get(i).getDistance()) > max) {
                max = (int) Math.round(horses.get(0).getDistance());
                winner = horses.get(i);
            }
        }
        return winner;
    }

    public static void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse alpha = new Horse("Apha", 3, 0);
        Horse beta = new Horse("Beta", 3, 0);
        Horse gamma = new Horse("Gamma", 3, 0);
        horses.add(alpha);
        horses.add(beta);
        horses.add(gamma);
        game.run();
        printWinner();
    }
}
