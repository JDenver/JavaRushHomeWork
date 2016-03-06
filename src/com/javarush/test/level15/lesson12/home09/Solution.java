package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        URL = URL.substring(URL.indexOf("?") + 1);
        String result = "";
        String param = "";
        int currentIndex = 0;
        List<String> objList = new ArrayList<String>();
        while (true) {
            currentIndex = URL.indexOf("&");
            if (currentIndex == -1) {
                param = URL;
                if (param.substring(0, 3).equals("obj")) {
                    param = param.substring(0, param.indexOf("="));
                    objList.add(param.substring(param.indexOf("=") + 1));
                }
                else if (param.indexOf("=") != -1)
                    param = param.substring(0, param.indexOf("="));
                result += param;
                break;
            }
            else {
                param = URL.substring(0, currentIndex);
                URL = URL.substring(currentIndex + 1);
                if (param.substring(0, 3).equals("obj")) {
                    objList.add(param.substring(param.indexOf("=") + 1));
                    param = param.substring(0, param.indexOf("="));
                }
                else if (param.indexOf("=") != -1)
                    param = param.substring(0, param.indexOf("="));
                result += param + " ";
            }
        }
        System.out.println(result);
        if (objList.size() > 0)
            for (String s : objList)
            {
                try
                {
                    alert(Double.parseDouble(s));
                } catch (NumberFormatException e) {
                    alert(s);
                }
            }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}





