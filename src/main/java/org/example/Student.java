package org.example;

public abstract class Student{
    protected String name;
    protected String surname;
    protected String patronymic;
    protected String course;
    protected int grate;

    public Student(String name, String surname, String patronymic, String course, int grate) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.course = course;
        this.grate = grate;
    }

    abstract void writeExam();

}
