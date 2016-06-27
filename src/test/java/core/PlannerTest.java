package core;

import domain.Employee;
import domain.WorkingWeek;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;
import java.util.List;

public class PlannerTest {
    private Planner planner;
    @Test
    public void shouldBeAbleToAddEmployeeToPlan() {
        List<Employee> employees = new ArrayList<>();

        planner = new Planner(employees);
        List<Employee> expectedEmployees = planner.getEmployees();
    }

    @Test
    public void shouldBeAbleToGetWorkingWeek() {
        WorkingWeek workingWeek = planner.getWorkingWeek();
    }
}
