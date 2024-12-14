package org.example;

public class IUStudent extends Student {

    public IUStudent(String name, String surname, String patronymic, String course, int grate) {
        super(name, surname, patronymic, course, grate);
    }
    @Override
    void writeExam() {
        System.out.println("ИУ студент " + name + surname + patronymic +
                " учащийся на курсе " + course + " закончил на оценку " + grate);
    }
}
