package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] list = new int[n];

        for (int i=0; i<list.length; i++)
            list[i] = Integer.parseInt(reader.readLine());

        int max = list[0];

        for (int i=1; i<list.length; i++)
            if (list[i]>max) max = list[i];

        System.out.println(max);
    }
}
