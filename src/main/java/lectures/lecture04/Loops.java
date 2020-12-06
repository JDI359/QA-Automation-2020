package lectures.lecture04;

public class Loops {

    public static void main(String[] args){

//        sumNumbersFromOneToN(4);

//        calculateFactorial(5);
//
//        calculateFactorialDoWhile(5);

//        printValues();

        subNumberFromLoop(3);
    }

    private static void printValues (){
        for (int i = 10; i>0; i--){
            System.out.println("The values are: " + i);
        }
    }

    private static void subNumberFromLoop (int numberForSumUntil){
        int sum = 0;
        for (int x=1; x<=numberForSumUntil; x++){
            sum +=x;
        }
        System.out.println("SUM " + sum);
    }
    private static void sumNumbersFromOneToN(int n){
        int numOne = 1;
        int sum = 1;
        while (numOne < n) {
            numOne++;
            sum += numOne;
            //+= означава, че към дясната стойност добавяме ст. на лявата
        }
        System.out.println("The sum is : " +sum);
    }

    private static void calculateFactorial (int number){
        long factorial = 1;
        System.out.println( "Initial number for calculation : " + number);
        while (true){
            if (number==1 || number ==0){
                break;
            }
            factorial *= number;
            number--;

        }
        System.out.println("n! = " + factorial);
    }

    private static void calculateFactorialDoWhile (int number){
        long factorial = 1;
        System.out.println( "Initial number for calculation : " + number);
        do {
            factorial *= number;
            number--;
        } while (number>0);
        System.out.println("n! = " + factorial);
    }
}
