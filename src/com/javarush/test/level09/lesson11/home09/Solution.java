package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> tmp = new HashMap<String, Cat>();
        tmp.put("q", new Cat("q"));
        tmp.put("w", new Cat("w"));
        tmp.put("e", new Cat("e"));
        tmp.put("r", new Cat("r"));
        tmp.put("t", new Cat("t"));
        tmp.put("y", new Cat("y"));
        tmp.put("u", new Cat("u"));
        tmp.put("i", new Cat("i"));
        tmp.put("a", new Cat("a"));
        tmp.put("s", new Cat("s"));

        return tmp;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> tmp = new HashSet<Cat>();
        tmp.addAll(map.values());

        return tmp;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
