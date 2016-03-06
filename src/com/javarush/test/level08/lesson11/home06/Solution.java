package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
/*        childs.add(new Human("asdf", true, 15));
        childs.add(new Human("qwer", true, 16));
        Human father = new
*/
        Human child1 = new Human("qwer", true, 15);
        Human child2 = new Human("asdf", true, 16);
        Human child3 = new Human("zxcv", false, 17);
        Human father = new Human("qaz", true, 45, child1, child2, child3);
        Human mother = new Human("wsx", false, 43, child1, child2, child3);
        Human grandFather1 = new Human("eec", true, 78, father);
        Human grandFather2 = new Human("rfv", true, 75, mother);
        Human grandMother1 = new Human("tgb", false, 73, father);
        Human grandMother2 = new Human("yhn", false, 71, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human child1) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
        }

        public Human (String name, boolean sex, int age, Human child1, Human child2, Human child3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(child1);
            this.children.add(child2);
            this.children.add(child3);
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
