package lectures.Lecture13HomeworkCompanies;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) throws RevenueCalculationException {

        CompanyET plamenAndCo = new CompanyET("Plamen&Co", "5th of July, 2003", "1234567890", "Plamen", 8000, 72000);
        CompanyCB planInvest = new CompanyCB("Plan Invest", "07.05.1997", "7427845628", "Angel", 10000, 20000);

//        log.info(planInvest.toString());
//        log.info(plamenAndCo.toString());

//        plamenAndCo.companyEarnings();
//        plamenAndCo.companyEarningsForPeriod("340days",150700);
//        plamenAndCo.companyEarningsForPeriod("0",150700);

        plamenAndCo.companyEarningsForPeriodNoExceptions("340days",150700);
    }
}