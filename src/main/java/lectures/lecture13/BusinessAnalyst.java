package lectures.lecture13;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BusinessAnalyst extends Employee {

    private static final String EMPLOYEE_POSITION_NAME = "Business Analyst";
    private static final String EMPLOYEE_DEPARTMENT_NAME = "Business Analysis & coordination";

    public BusinessAnalyst(String name, int employeeID) {
        super(name, employeeID, EMPLOYEE_DEPARTMENT_NAME, EMPLOYEE_POSITION_NAME);
    }

    @Override
    public int getDailyRate(){
        log.info("business analyst rate: " + 70);
        return 70;
    }
}
