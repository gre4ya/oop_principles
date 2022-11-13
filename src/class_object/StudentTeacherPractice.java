package class_object;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Alex", "Morgan");
        System.out.println(teacher1.getStudents().size()); // 0

        Student student1 = new Student("Mike", "Smith", 25);
        Student student2 = new Student("Jane", "Smith", 30);
        Student student3 = new Student("A", "X", 17);
        Student student4 = new Student("B", "Y", 19);
        Student student5 = new Student("C", "Z", 23);

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);

        //System.out.println(teacher1.getStudents()); // [Student{firstName='Mike', lastName='Smith', age=25}, Student{firstName='Jane', lastName='Smith', age=30}]

        // Print all the students name for the teacher John
        for (Student s : teacher1.students) {
            System.out.println(s.firstName);
        }

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);

        int sumOfAge = 0;
        int totalStudents = 0;

        for (Teacher teacher : teachers) {
            if(teacher.fName.equals("Alex")){
                totalStudents = teacher.getStudents().size();
                for (Student student : teacher.getStudents()) {
                    sumOfAge += student.age;
                }
            }
        }
        System.out.println("The average age of " + teacher2.fName + " " +
                teacher2.lName + "'s students is " + sumOfAge/totalStudents +
                " years.");

    }
}

