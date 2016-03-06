package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = Integer.parseInt(s3);
        int min=0, mid=0, max=0;

        if (a<b && a<c) {
            min=a;
            if (b<c) mid=b; else mid=c;
        }
        else if (b<c && b<a) {
            if (a<c) mid=a; else mid=c;
        }
        else if (c<a && c<b) {
            if (a<b) mid = a; else mid = b;
        }


        System.out.println(mid);
    }
}
