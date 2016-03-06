package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result = "";

        char[] work = s.toCharArray();
        String tmp = "";
        if (work[0] != ' ')
        {
            tmp += work[0];
            result += tmp.toUpperCase();
        }
        else result += work[0];
        for (int i = 1; i < work.length; i++)
            if (work[i-1] == ' ' && work[i] != ' ') {
                tmp = "";
                tmp += work[i];
                result += tmp.toUpperCase();
            }
            else result += work[i];

        System.out.println(result);

        //напишите тут ваш код
    }


}
