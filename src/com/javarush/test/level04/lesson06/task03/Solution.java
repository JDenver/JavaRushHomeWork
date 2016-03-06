package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sA = reader.readLine();
        String sB = reader.readLine();
        String sC = reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);
        int r1, r2, r3;

        if ((a>b)&&(a>c)) {
            r1 = a;
            if (b>c) {
                r2 = b; r3 = c;
            } else { r2 = c; r3 = b; }
        }
        else if (b>c) {
            r1 = b;
            if (a>c) {
                r2 = a; r3 = c;
            } else { r2 = c; r3 = a; }
        }
        else {
            r1 = c;
            r2 = b;
            r3 = a;
        }

        System.out.println(r1 + " " + r2 + " " + r3);
    }
}
