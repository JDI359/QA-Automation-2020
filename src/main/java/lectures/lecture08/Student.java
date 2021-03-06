package lectures.lecture08;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
//@Setter
public class Student extends Person{
    private String faculty;
    private String specialty;
    private int facultyNumber;
    private List<String> courses;


    public Student(String name, int age, String faculty, String specialty, int facultyNumber){
        super(name, age);
        this.faculty = faculty;
        this.specialty = specialty;
        this.facultyNumber = facultyNumber;
    }

    public void prepareForExam(int numberOfCourses, int daysBeforeExam){
        if(numberOfCourses>5 && daysBeforeExam<2){
            System.out.println("No time left.");
        } else {
            System.out.println("Play hard");
        }
    }

    public void prepareForExam(){
        System.out.println("No preparation.");
    }

    @Override
    public void levelOfEducation(EducationLevel educationLevel) {
        System.out.println("UNIVERSITY education");
    }

    @Override
    public void profession() {
        System.out.println("I am still a student.");
    }

    @Override
    public String toString() {
        return "Student: " +
                "faculty ='" + faculty + '\'' +
                ", specialty ='" + specialty + '\'' +
                ", faculty number = " + facultyNumber +
                ", courses=" + courses +
                '.';
    }
}
