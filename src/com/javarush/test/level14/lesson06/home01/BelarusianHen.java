package com.javarush.test.level14.lesson06.home01;


class BelarusianHen extends Hen
{
    final static int NUM = 100;
    public int getCountOfEggsPerMonth() {
        return NUM;
    }

    public String getDescription() {
        String result = super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
        return result;
    }
}
