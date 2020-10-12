package com.company;

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

    }
}
