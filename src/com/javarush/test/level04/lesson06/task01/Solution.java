package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum1 = reader.readLine();
        String sNum2 = reader.readLine();
        int n1 = Integer.parseInt(sNum1);
        int n2 = Integer.parseInt(sNum2);
        int result = 0;

        if (n1<n2) result = n1;
            else result = n2;

        System.out.println(result);

    }
}