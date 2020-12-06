package lectures.lecture10;

import lectures.lecture08.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestReferenceMethods {

    public static void main(String[] args) {

        // Static method reference
        StudentMethodReference[] students = {new StudentMethodReference(3.4), new StudentMethodReference(5.3), new StudentMethodReference(2.8)};

        Arrays.sort(students, StudentMethodReference::compareGrades);

        for (StudentMethodReference student : students){
            System.out.println(student.getAverageGrade());
        }

        //Object method reference
        StudentMethodReference[] studentNames = {new StudentMethodReference("Georgi"), new StudentMethodReference("Petar")};

        CompareObjects compareObjects = new CompareObjects();
        Arrays.sort(studentNames, compareObjects::compareByNames);

        for (StudentMethodReference student : studentNames){
            System.out.println(student.getName());
        }

        //Abritrary method reference
        List<String> names = new ArrayList<>();
        names.add("Dimitar");
        names.add("Albena");
        names.add("Kristina");

        names.forEach(System.out::println);
    }
}
