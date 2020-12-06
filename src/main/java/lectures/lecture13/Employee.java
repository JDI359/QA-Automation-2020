package lectures.lecture13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Slf4j
public class Employee {

    private String name;
    private int employeeID;
    private String department;
    private String position;

    protected int calculateEmployeeMonthlySalaryWithBonus(int workDays, int dailyGrossRate, int monthBonus){
        int calculatedSalary = calculateSalary(workDays, dailyGrossRate) + monthBonus;
        log.info("The Employee {} has salary: {}", name, calculatedSalary);
        return calculatedSalary;
    }

    private int calculateSalary(int workDays, int dailyGrossRate){
        return workDays * dailyGrossRate;
    }

    @Override
    public String toString(){
        return ("Employee: " + name + " with ID: " + employeeID + " on position " + position + " in department " + department);
    }

    public int getDailyRate(){
        return 50;


    }
}
