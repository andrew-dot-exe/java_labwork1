package main.java.mod1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double avg = student.getAverageGrade();
            if (avg < 3.0) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(
            new Student("Иван Петров", "ИФСТ-11", 1, List.of(3, 4, 5))
        );
        students.add(
            new Student("Петр Иванов", "ИФСТ-21", 2, List.of(2, 2, 2))
        );
        students.add(
            new Student("Юра Борисов", "ИФСТ-31", 3, List.of(4, 5, 5))
        );

        System.out.println("До обработки:");
        students.forEach(s ->
            System.out.println(s.getName() + " - курс " + s.getCourse())
        );

        processStudents(students);

        System.out.println("\nПосле обработки:");
        students.forEach(s ->
            System.out.println(s.getName() + " - курс " + s.getCourse())
        );

        printStudents(students, 2);
    }
}
