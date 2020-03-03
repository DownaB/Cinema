package com.ocr.downa2;

public class Dateofbirth{

    private int day;
    private int month;
    private int year;


    public Dateofbirth(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "né(e) le : " + getDay() + getMonth() + getYear();
    }

}
