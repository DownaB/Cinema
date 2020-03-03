package com.ocr.downa2;

public class Person {
    protected String name;
    protected String firstName;
    protected String nationality;
    protected int id;
    protected Dateofbirth date;

    public Person (int id,String name, String firstName, String nationality, Dateofbirth date) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.nationality = nationality;
        this.date = date;
    }
        public int getId(){
            return id;
        }
        public String getName () {
            return name;
        }
        public String getFirstName () {
            return firstName;
        }
        public String getNationality () {
            return nationality;
        }
        public Dateofbirth getDate(){
        return date;
        }


    @Override
    public String toString() {
        return " Nom " + getName() + "prénom " + getFirstName() + "nationalité " + getNationality() + "né(e) le " + getDate();
    }
}

