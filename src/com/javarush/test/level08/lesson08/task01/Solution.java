package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();

        set.add("Л");
        set.add("Лй");
        set.add("Лц");
        set.add("Лу");
        set.add("Лк");
        set.add("Ле");
        set.add("Лн");
        set.add("Лг");
        set.add("Лш");
        set.add("Лщ");
        set.add("Лз");
        set.add("Лх");
        set.add("Лъ");
        set.add("Лф");
        set.add("Лы");
        set.add("Лв");
        set.add("Ла");
        set.add("Лп");
        set.add("Лр");
        set.add("Ло");

        return set;

    }
}
