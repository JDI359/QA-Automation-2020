package lectures.lecture08;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public abstract class Teacher extends Person {
    private String faculty;
    private String subject;
    private int teacherID;
    private List<String> classes;



    public Teacher(String name, int age, String faculty, String subject, int teacherID){
        super(name, age);
        this.faculty = faculty;
        this.subject = subject;
        this.teacherID = teacherID;
    }

    @Override
    public void profession() {
        System.out.println("Full-time teacher");
    }

    public void classesToTeach(int numberOfClases, int maxClassessPerWeek){
        if(numberOfClases<10 && maxClassessPerWeek==20){
            System.out.println("Assing additional classes to this teacher.");
        } else if (numberOfClases<20 && maxClassessPerWeek==20) {
            System.out.println("Within norm.");
        } else {
            System.out.println("Transfer classes to another teacher!");
        }
    }

    @Override
    public String toString() {
        return "Teacher info: " +
                " name = '"  + this.getName() + '\'' +
                ", faculty = '" + faculty + '\'' +
                ", subject = '" + subject + '\'' +
                ", teacherID = " + teacherID +
                ", classes = " + classes +

                '.';
    }
}
