package lectures.lecture03;

import com.sun.javafx.css.CalculatedValue;

public class Homework {
    public static void main (String[] args) {
        getNumberOfWeekDays(5);
        isNumberPositiveOrNegative(-3);
        calculateRectanglePerimeter(5, 6);
        calculateRectangleFace(5, 6);
        findBiggestNumber(5,22222,14);

    }
    private static void getNumberOfWeekDays (int day){
        String weekName = null;

        switch (day) {
            case 1:
                weekName = "Monday";
//                    day = 1;
                break;
            case 2:
                weekName = "Tuesday";
//                    day = 2;
                break;
            case 3:
                weekName = "Wednesday";
//                    day = 3;
                break;
            case 4:
                weekName = "Thursday";
//                    day = 4;
                break;
            case 5:
                weekName = "Friday";
//                    day = 5;
                break;
            case 6:
                weekName = "Saturday";
//                    day = 6;
                break;
            case 7:
                weekName = "Sunday";
//                    day = 7;
                break;
            default:
                System.out.println("Enter a valid week day.");
        }

        System.out.println("You entered " + day + ". So week day is " + weekName + ".");
    }

    private static void calculateRectanglePerimeter (int lenght, int hight){
        int perimeter = (lenght + hight)*2;

        System.out.println("Rectangle perimeter is " + perimeter + " squared meters.");
    }

    private static void calculateRectangleFace(int lenght, int hight){
        int face = lenght * hight;
        System.out.println("Rectangle face is " + face + " squared meters.");
    }


    private static void isNumberPositiveOrNegative (int number){
        if (number > 0){
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }

    private static void findBiggestNumber (int number1, int number2, int number3) {
        if (number1>number2 && number1>number3)
        {
            System.out.println("Number 1: " + number1 + " is the biggest number.");
        } else if (number2>number1 && number2>number3)
        {
            System.out.println("Number 2: " + number2 + " is the biggest number.");
        } else {
            System.out.println("Number 3: " + number3 + " is the biggest number.");
        }
    }

}




