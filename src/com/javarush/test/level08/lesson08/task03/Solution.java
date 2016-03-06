package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("adfwefwef", "zvw");
        map.put("asdfafwae", "awefsda");
        map.put("awefasdf", "waefasd");
        map.put("aef", "xcvw");
        map.put("asdfa", "waefsd");
        map.put("zxcvzxcv", "wefz");
        map.put("zxcvz", "awfasd");
        map.put("zxcvwer", "asdf");
        map.put("waffasd", "asdf");
        map.put("awefawfsad", "asdf");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;

        for (String i : map.values())
            if (i.equals(name)) count++;
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;

        for (String i : map.keySet())
            if (i.equals(lastName)) count++;

        return count;

    }
}
