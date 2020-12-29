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

    public CompanyET(String companyName, String companyCreationDate, String bulsatNumber, String founderName, double companyStartingFunds, double currentCapital) {
        super(companyName, companyCreationDate, bulsatNumber);
    }

    protected int companyEarnings(double companyStartingFunds, double currentCapital){
        double earnings = currentCapital - companyStartingFunds;
        log.info("Current company profit is: " + earnings);
        return 0;
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
