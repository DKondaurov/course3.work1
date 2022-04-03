package ru.hogwarts.school;

import ru.hogwarts.school.domain.Faculty;
import ru.hogwarts.school.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        List<Faculty> faculties = new ArrayList<>();

        Student student1 = new Student(1L, "Чувак", 28);
        Student student2 = new Student(2L, "Чувакер", 32);
        Student student3 = new Student(3L, "Эль Чувачино", 18);

        Faculty faculty = new Faculty(1L, "Школа Воплощения", "Красный");
        Faculty faculty2 = new Faculty(2L, "Школа Иллюзий", "Фиолетовый");
        Faculty faculty3 = new Faculty(3L, "Школа Преобразования", "Зелёный");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        faculties.add(faculty);
        faculties.add(faculty2);
        faculties.add(faculty3);

        System.out.println(students);
        System.out.println(faculties);
    }
}
