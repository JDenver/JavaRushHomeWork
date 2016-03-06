package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        int count=0;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            String value = pair.getValue();
            count = 0;
            for (Map.Entry<String, String> secondPair : copy.entrySet())
                if (secondPair.getValue().equals(value)) count++;
            if (count > 1) {
                removeItemFromMapByValue(map, value);
            }

        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
