package lectures.lecture08;

import java.util.ArrayList;
import java.util.List;

public class MainLecture08 {

    public static void main(String[] args) {
//        Student student = new Student("Agop", 29, "Architecture", "arch", 30);

        Teacher teacher = new Teacher("Kiril", 30, "CTO", "QA automation", 007) {
        };

//        List<String> studentCourses = new ArrayList<String>();
//        studentCourses.add("Math");
//        studentCourses.add("Progamming");

//        student.setCourses(studentCourses);
//        System.out.println(student.getCourses());
//        System.out.println(student.toString());
//        student.prepareForExam(4, 7);
//        student.levelOfEducation(EducationLevel.NO);

        System.out.println(teacher.toString());

    }
}
