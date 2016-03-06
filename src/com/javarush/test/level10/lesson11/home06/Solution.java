package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name, secName, lastName;
        int age, weight, height;

        public Human() {

        }
        public Human(String name) {

        }
        public Human(String name, String lastName) {

        }
        public Human(String name, String lastName, String secName) {

        }
        public Human(String name, String lastName, String secName, int age) {

        }
        public Human(String name, String lastName, String secName, int age, int weight) {

        }
        public Human(String name, String lastName, String secName, int age, int weight, int height) {

        }
        public Human(String name, int age) {

        }
        public Human(int age) {

        }
        public Human(int age, int weight) {

        }
    }
}
