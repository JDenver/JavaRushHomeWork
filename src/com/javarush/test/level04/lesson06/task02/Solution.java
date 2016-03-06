package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int d = Integer.parseInt(s4);
        int result = 0;

        if (maxim(a,b)>maxim(c,d)) result = maxim(a,b);
            else result = maxim(c,d);

        System.out.println(result);
    }

    static int maxim(int a, int b) {
        if (a>b) return a;
        else return b;
    }

}
