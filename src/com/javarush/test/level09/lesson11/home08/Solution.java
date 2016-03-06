package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> tmp = new ArrayList<int[]>();
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {1, 2};
        int[] a3 = {1, 2, 3, 4};
        int[] a4 = {1, 2, 3, 4, 5, 6, 7};
        int[] a5 = new int[0];
        tmp.add(a1);
        tmp.add(a2);
        tmp.add(a3);
        tmp.add(a4);
        tmp.add(a5);

        return tmp;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
