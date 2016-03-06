package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean check = false;
        int count = 0;

        while (!check) {
            String str = reader.readLine();
            int num = Integer.parseInt(str);
            if (num == -1) { count += num; check = true; }
                else count += num;
        }
        System.out.println(count);
    }
}
