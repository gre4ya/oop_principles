package class_object;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    public Teacher(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String fName;
    public String lName;
    public List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public void add(Student student1) {
    }
}
