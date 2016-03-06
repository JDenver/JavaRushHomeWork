package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String inputFileName = consoleReader.readLine();
        File inFile = new File(inputFileName);
        BufferedReader fileReader = new BufferedReader(new FileReader(inFile));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String current = "";

        while ((current = fileReader.readLine()) != null) {
            list.add(Integer.parseInt(current));
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            for (int j = i; j < list.size(); j++) {
                if (list.get(j) < min) {
                    min = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, min);
                }
            }
        }

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
