package lectures.lecture08;

import lombok.Getter;

public abstract class Person {
    @Getter
    private String name;
    private int age;
    private ContactInfo contactInfo; //Person HAS-A ContactInfo (Aggregation)

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void levelOfEducation (EducationLevel educationLevel){
        switch (educationLevel){
            case NO:
                System.out.println("Person has no education. Needs to be educated");
            case BASIC:
                System.out.println("Person has basic education level.");
            case HIGH_SCHOOL:
                System.out.println("Person has HS education level.");
            case UNIVERSITY:
                System.out.println("Person has uni education level.");
        }
    }

    public abstract void profession();



}
