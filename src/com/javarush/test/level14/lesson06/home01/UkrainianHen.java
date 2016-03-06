package com.javarush.test.level14.lesson06.home01;


class UkrainianHen extends Hen
{
    final static int NUM = 300;
    public int getCountOfEggsPerMonth() {
        return NUM;
    }

    public String getDescription() {
        String result = super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
        return result;
    }
}
