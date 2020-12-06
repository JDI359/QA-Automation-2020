package lectures.lecture13;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PRIVATE_MEMBER;
@Slf4j
public class QualityEngineer extends Employee {

    private static final String EMPLOYEE_POSITION_NAME = "Quality Assurance Engineer";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Quality Assurance";

    @Getter
    private boolean isTestAutomationExpert;

    public QualityEngineer(String name, int employeeID) {
        super(name, employeeID, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    public QualityEngineer(String name, int employeeID, boolean isTestAutomationExpert) {
        super(name, employeeID, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
        this.isTestAutomationExpert = isTestAutomationExpert;
    }

    public int getSalary(int workDays, int dailyGrossRate, int bonus){
        return calculateEmployeeMonthlySalaryWithBonus(workDays, dailyGrossRate, bonus);
    }

    public int getSalary(int workDays, int dailyGrossRate){
        return super.calculateEmployeeMonthlySalaryWithBonus(workDays, dailyGrossRate, 2000);
    }

    protected int calculateEmployeeMonthlySalaryWithBonus(int workedDays, int dailyGrossRate){
//        return super.calculateEmployeeMonthlySalaryWithBonus(workDays, dailyGrossRate, bonus);
        log.info("Salary is: " + 3500);
        return 3500;
    }
}
