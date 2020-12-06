package lectures.lecture03;

public class Main {
    public static void main(String[] args){
//        checkYoungPeopleRight(18);
        getMonthNumberOfDays(2, 2016);
        getMonthNumberOfDays(2, 2000);
        getMonthNumberOfDays(2, 1900);

    }

    private static void getMonthNumberOfDays(int month, int year){
        String monthName;
        int numberOfDays = 0;

        switch (month) {
            case 1:
                monthName = "January";
                numberOfDays = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numberOfDays = 29;
                } else {
                    numberOfDays = 28;
                }
                break;
            default:
                monthName = "Unknown.";
        }

        System.out.println("The month " + monthName + " has " + numberOfDays + " number of days.");

    }

    private static void checkYoungPeopleRight (int age){
        boolean isAllowedToDrive = false;
        boolean hasRightsToDrink = false;
        boolean isAllowedToVote = false;

        if (age < 18){
            System.out.println("Person is under the lagel age.");
        } else if (age>=18 && age<21){
            isAllowedToDrive = true;
            isAllowedToVote = true;
        } else {
            isAllowedToDrive = true;
            isAllowedToVote = true;
            hasRightsToDrink = true;
        }
        System.out.println("The person is allowed to drive: " + isAllowedToDrive);
        System.out.println("The person is allowed to vote: " + isAllowedToVote);
        System.out.println("The person is allowed to drink: " + hasRightsToDrink);
    }

}
