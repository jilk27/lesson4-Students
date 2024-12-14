package org.example;

public class Main {
    public static void main(String[] args) {


        IUStudent stud1 = new IUStudent("Кирил", "Сачков", "Евгенич", "Прикладная информатика", 12);
        MathStudent stud2 = new MathStudent("Татьяна", "Сабаева", "Евгенич", "Прикладная математика", 7);
        stud1.writeExam();
        stud2.writeExam();
    }
}