package com.javarush.test.level14.lesson06.home01;


class MoldovanHen extends Hen
{
    final static int NUM = 200;
    public int getCountOfEggsPerMonth() {
        return NUM;
    }

    public String getDescription() {
        String result = super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " +
                getCountOfEggsPerMonth() + " яиц в месяц.";
        return result;
    }
}
