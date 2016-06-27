package domain;

public class Contract {
    private ContractType contractType;

    private int maximumHoursWork;

    private int minimumHoursWork;

    private double holidays;

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public int getMaximumHoursWork() {
        return maximumHoursWork;
    }

    public void setMaximumHoursWork(int maximumHoursWork) {
        this.maximumHoursWork = maximumHoursWork;
    }

    public int getMinimumHoursWork() {
        return minimumHoursWork;
    }

    public void setMinimumHoursWork(int minimumHoursWork) {
        this.minimumHoursWork = minimumHoursWork;
    }

    public double getHolidays() {
        return holidays;
    }

    public void setHolidays(double holidays) {
        this.holidays = holidays;
    }
}
