package lectures.lecture10;

import lombok.Getter;

@Getter
public class StudentMethodReference {

    private double averageGrade;
    private String name;

    public StudentMethodReference(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public StudentMethodReference(String name) {
        this.name = name;
    }

    public static int compareGrades(StudentMethodReference a, StudentMethodReference b){
        if (a.averageGrade > b.averageGrade) return 1;
        else if (a.averageGrade < b.averageGrade) return -1;
        else return 0;
    }
}
