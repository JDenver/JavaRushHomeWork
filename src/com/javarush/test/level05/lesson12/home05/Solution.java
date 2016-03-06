package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        boolean stop = false;

        while (stop == false) {
            String str = reader.readLine();
            if (str.equals("сумма")) stop = true;
                else { int num = Integer.parseInt(str); count += num; }

        }

        System.out.println(count);
    }
}
