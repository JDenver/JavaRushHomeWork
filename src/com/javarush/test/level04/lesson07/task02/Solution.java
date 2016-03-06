package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNum = reader.readLine();
        int num = Integer.parseInt(sNum);
        String chet, razrad;

        if ((num>0)&&(num<1000)) {
            if (num%2==0) chet="четное";
                else chet="нечетное";

            if (num%1000<10) razrad="однозначное";
                else if (num%1000<100) razrad="двузначное";
                else razrad="трехзначное";
            if (num==10) razrad="двузначное";
            if (num==100) razrad="трехзначное";
            System.out.println(chet + " " + razrad + " число");
        }
    }
}
