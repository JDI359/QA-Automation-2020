package lectures.lecture14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CustomCalculateException {
        FileReader.readFile("sfas");
//        ScannerReader.readFromConsole();
//        calculate(5,0);
    }

    private static int calculate(int a, int b) throws CustomCalculateException {
        try {
            return a/b;
        } catch (ArithmeticException ae){
            throw new CustomCalculateException("Dividing by zero is not allowed.");
        }
    }
}
