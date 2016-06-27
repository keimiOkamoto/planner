package core;

import domain.Employee;
import domain.WorkingWeek;

import java.util.List;

/**
 * Created by keimiokamoto on 27/06/2016.
 */
public class Planner {
    private List<Employee> employees;
    private WorkingWeek workingWeek;

    public Planner(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public WorkingWeek getWorkingWeek() {
        return workingWeek;
    }
}
