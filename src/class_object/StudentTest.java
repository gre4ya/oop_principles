package class_object;

public class StudentTest {

    public static void main(String[] args) {

        System.out.println(Student.numberOfStudents); //0
        System.out.println(Student.program); // Software Engineer in Test

        Student student1 = new Student("John", "Doe", 45);
        System.out.println(Student.numberOfStudents); //1

        Student student2 = new Student("Jane", "Doe", 23);
        System.out.println(Student.numberOfStudents); //2

        student1.study(); // John studies
        student2.study(); // Jane studies

        student1.rest(); // John Doe rests
        student2.rest(); // Jane Doe rests


    }
}
