package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Den", 27, "asdf");
        Man man2 = new Man("Pit", 12, "qwer");
        Woman woman1 = new Woman("Marta", 34, "zxcv");
        Woman woman2 = new Woman("Olga", 21, "bvnm");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

/*        man1.getDataMan();
        man2.getDataMan();
        woman1.getDataWoman();
        woman2.getDataWoman();
*/
    }

    public static class Man {
        public String name, address;
        public int age;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

/*        public void getDataMan() {
            System.out.println(this.name + " " + this.age + " " + this.adress);
        }*/
   }

    public static class Woman
    {
        public String name, address;
        public int age;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

/*        public void getDataWoman()
        {
            System.out.println(this.name + " " + this.age + " " + this.adress);
        }*/
    }
}
