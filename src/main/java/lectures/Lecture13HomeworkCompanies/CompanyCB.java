package lectures.Lecture13HomeworkCompanies;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class CompanyCB extends Company implements CompanyBusiness {

    private String founderName;
    private double companyStartingFunds;
    private double currentCapital;

    public CompanyCB(String companyName, String companyCreationDate, String bulsatNumber, String founderName, double companyStartingFunds, double currentCapital) {
        super(companyName, companyCreationDate, bulsatNumber);
    }

    @Override
    public void businessType(){
        log.info("Company CB is a construction business.");
    }

    @Override
    public void companySize(){
        log.info("Company CB has a 200 employees.");
    }

    @Override
    public void companyHq(){
        log.info("Company CB has an HQ in Sofia.");
    }
}
