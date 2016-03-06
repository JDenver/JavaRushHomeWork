package com.javarush.test.level10.lesson11.home04;

/* Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.
Образец:
Я не хочу изучать Java, я хочу большую зарплату
 не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
 хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
/*        char[] work = s.toCharArray();
        for (int i = 0; i < 40; i++) {
            int tmp = 0;
            char[] result = new char[60];
            for (int j = i; j < s.length(); j++) {
                result[tmp] = work[j];
                tmp++;
            }
            String resOut = "";
            for (int j = 0; j < tmp; j++)
                resOut += result[j];
            System.out.println(result);
        }
*/
        //напишите тут ваш код
        for (int i = 0; i < 40; i++)
            System.out.println(s.substring(i));
    }

}
