package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandPa1 = new Human("Юра", true, 81);
        Human grandPa2 = new Human("Коля", true, 75);
        Human grandMa1 = new Human("Галя", false, 80);
        Human grandMa2 = new Human("Таня", false, 78);
        Human dad = new Human("Игорь", true, 55, grandPa1, grandMa1);
        Human mom = new Human("Анжела", false, 50, grandPa2, grandMa2);
        Human child1 = new Human("Денис", true, 27, dad, mom);
        Human child2 = new Human("Оля", false, 21, dad, mom);
        Human child3 = new Human("Саша", true, 23, dad, mom);

        grandPa1.toString();
        grandPa2.toString();
        grandMa1.toString();
        grandMa2.toString();
        dad.toString();
        mom.toString();
        child1.toString();
        child2.toString();
        child3.toString();
    }

    public static class Human
    {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name,boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            System.out.println(text);

            return text;
        }
    }

}
