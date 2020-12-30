package lectures.Lecture13HomeworkCompanies;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class CompanyET extends Company implements CompanyBusiness {

    private String founderName;
    private double companyStartingFunds;
    private double currentCapital;

    private boolean isNumber(String s){
        return s.matches("[0-9]+(,[0-9]+)*,?");
    }

    public CompanyET(String companyName, String companyCreationDate, String bulsatNumber, String founderName, double companyStartingFunds, double currentCapital) {
        super(companyName, companyCreationDate, bulsatNumber);
    }

    protected double companyEarnings(){
        double earnings = currentCapital - companyStartingFunds;
        log.info("Current company profit is: " + earnings);
        return earnings;
    }

    protected int companyEarningsForPeriod(String calculationPeriodInDays, int revenueForPeriod) throws RevenueCalculationException {
        try {
            int calculationPeriodInDaysInt = Integer.parseInt(calculationPeriodInDays);
            int earnings = revenueForPeriod / calculationPeriodInDaysInt;
            log.info("Calculated earnings per day for this period are: " + earnings);

        } catch (NumberFormatException nfe){
//            log.error("Enter valid period or revenue amount using only numbers.");
            throw new RevenueCalculationException("Dividing by zero is not allowed." , nfe);
        }
         catch (ArithmeticException ae){
//            log.error("Impossible division, please check the numbers again.");
             throw new RevenueCalculationException("Dividing by zero is not allowed.");
        }
        return revenueForPeriod;
    }

    protected int companyEarningsForPeriodNoExceptions(String calculationPeriodInDays, int revenueForPeriod){
            if(isNumber(calculationPeriodInDays)) {
            int calculationPeriodInDaysInt = Integer.parseInt(calculationPeriodInDays);
                if(calculationPeriodInDaysInt != 0){
                int earnings = revenueForPeriod / calculationPeriodInDaysInt;
                log.info("Calculated earnings per day for this period are: " + earnings);
                }
            }else{
                log.info("Please enter valid number for Period.");
            }
        return revenueForPeriod;
    }

    @Override
    public void businessType() {
        log.info("Company ET is a business for R&D on electronics.");
    }

    @Override
    public void companySize() {
        log.info("Company ET has a 100 employees.");
    }

    @Override
    public void companyHq() {
        log.info("Company ET has an HQ in Plovdiv.");
    }
}
