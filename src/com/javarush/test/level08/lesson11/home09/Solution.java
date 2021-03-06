package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
/*        Date cDate = new Date();
        String date = cDate.toString();
        System.out.println(cDate.getDate() + " = " + isDateOdd(date));
*/
    }

    public static boolean isDateOdd(String date)
    {
        Date currentDate = new Date(date);
        Date startDate = new Date();
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);
        startDate.setDate(1);
        startDate.setMonth(0);

        long msDistance = currentDate.getTime() - startDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        if ((msDistance/msDay) % 2 == 0)
            return false;
        else
            return true;
    }
}
