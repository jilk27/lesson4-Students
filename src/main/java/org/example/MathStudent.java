package org.example;


public class MathStudent extends Student {
    public MathStudent(String name, String surname, String patronymic, String course, int grate) {
        super(name, surname, patronymic, course, grate);
    }

    void writeExam() {
        System.out.println("Матем студент " + name + surname + patronymic +
                " учащийся на курсе " + course + " закончил на оценку " + grate);
    }
}
