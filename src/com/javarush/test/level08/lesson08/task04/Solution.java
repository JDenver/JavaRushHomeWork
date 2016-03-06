package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
/*    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallon", new Date("JUNE 1 1980"));
        map.put("Stalloe", new Date("JUNE 1 1980"));
        map.put("Stallne", new Date("JUNE 1 1980"));
        map.put("Stalonte", new Date("JUNE 1 1980"));
        map.put("Stalone", new Date("JUNE 1 1980"));
        map.put("Stllrone", new Date("JUNE 1 1980"));
        map.put("Salldfone", new Date("JUNE 1 1980"));
        map.put("tallone", new Date("JUNE 1 1980"));
        map.put("eStallone", new Date("JUNE 1 1980"));

        //напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for (Map.Entry<String, Date> pair : map.entrySet())
            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7)
                map.remove(pair.getKey());

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if ( (pair.getValue().getMonth()) > 4 && (pair.getValue().getMonth() < 7) )
                iterator.remove();
        }
    }
*/
public static HashMap<String, Date> createMap()
{
    HashMap<String, Date> map = new HashMap<String, Date>();
    map.put("Stallone", new Date("JUNE 1 1980"));
    map.put("Stan", new Date("JUNE 1 1980"));
    map.put("Still", new Date("JULY 1 1980"));
    map.put("Stoke", new Date("AUGUST 1 1980"));
    map.put("Sta", new Date("JUNE 1 1980"));
    map.put("Sting", new Date("DECEMBER 1 1980"));
    map.put("Stake", new Date("JUNE 1 1980"));
    map.put("Stone", new Date("JUNE 1 1980"));
    map.put("Taken", new Date("JUNE 1 1980"));
    map.put("Slow", new Date("MAY 1 1980"));
    return map;
}
    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if ((pair.getValue().getMonth() > 4) && (pair.getValue().getMonth() < 8)){
                iterator.remove();
            }
        }
    }
}
