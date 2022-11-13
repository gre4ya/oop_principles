package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John", "Doe");
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher);

        Student student1 = new Student("Alex", "Smith", 20);
        Student student2 = new Student("Harry", "Potter", 14);
        Student student3 = new Student("Frodo", "Beggins", 24);
        Student student4 = new Student("John", "Wick", 40);

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        int oldest = Integer.MIN_VALUE;
        int  youngest = Integer.MAX_VALUE;

        for (Student student : teacher.getStudents()) {
            if(student.age < youngest) youngest = student.age;
            if(student.age > oldest) oldest = student.age;
        }
        System.out.println("The oldest student age is " + oldest);
        System.out.println("The youngest student age is " + youngest);
        System.out.println("The difference between oldest and youngest students is " + (oldest - youngest));
    }





}
