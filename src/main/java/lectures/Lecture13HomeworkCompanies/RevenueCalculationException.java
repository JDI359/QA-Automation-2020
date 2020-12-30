package lectures.Lecture13HomeworkCompanies;

public class RevenueCalculationException extends Exception{
    RevenueCalculationException(String message){
        super(message);
    }
    RevenueCalculationException(String message, Throwable cause){
        super(message, cause);
    }
}