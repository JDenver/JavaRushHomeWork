package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] list = new int[5];
        int min = 0, index = 0, temp = 0;

        for (int i = 0; i < list.length; i++)
            list[i] = Integer.parseInt(reader.readLine());
        min = list[0];
        for (int i = 0; i < list.length; i++) {
            index = i;
            for (int j = i; j < list.length; j++)
                if (list[j] < list[index]) index = j;
            temp = list[i];
            list[i] = list[index];
            list[index] = temp;
        }

        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);

    }
}
