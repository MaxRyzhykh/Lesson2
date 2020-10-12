package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int yearOfBirthday = 1996;
        int monthOfBirthday = 5;
        int dayOfBirthday = 4;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: " + sum);

        boolean monthBiggerDay;
        monthBiggerDay  = monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: " + monthBiggerDay);

        char[] name = new char[6];
        name[0] = 'M';
        name[1] = 'a';
        name[2] = 'k';
        name[3] = 's';
        name[4] = 'i';
        name[5] = 'm';
        System.out.println(Arrays.toString(name));

    }
}
