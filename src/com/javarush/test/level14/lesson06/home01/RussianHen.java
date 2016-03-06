package com.javarush.test.level14.lesson06.home01;


class RussianHen extends Hen
{
    final static int NUM = 400;
    public int getCountOfEggsPerMonth() {
        return NUM;
    }

    public String getDescription() {
        String result = super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
        return result;
    }
}
