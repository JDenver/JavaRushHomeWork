package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution() {}
    public Solution(int a) {}
    public Solution(double a) {}

    protected Solution(int a, int b) {}
    protected Solution(double a, double b) {}
    protected Solution(int a, double b) {}

    Solution(double a, int b) {}
    Solution(String s) {}
    Solution(String s, int a) {}

    private Solution(float a) {}
    private Solution(float a, int b) {}
    private Solution(int a, float b) {}

}

