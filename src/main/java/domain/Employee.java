package domain;


public class Employee {
    private String id;

    private String firstName;

    private String secondName;

    private String dob;

    private String emailAddress;

    private Contract contract;


    public static class Builder {
        private final String id;
        private final String firstName;
        private final String secondName;
        private final Contract contract;

        private String dob = "";
        private String emailAddress = "";

        public Builder(String id, String firstName, String secondName, Contract contract) {
            this.id = id;
            this.firstName = firstName;
            this.secondName = secondName;
            this.contract = contract;
        }

        public Builder dob(String val) {
            dob = val;
            return this;
        }

        public Builder emailAddress(String val) {
            emailAddress = val;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    private Employee(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        secondName = builder.secondName;
        contract = builder.contract;
        dob = builder.dob;
        emailAddress = builder.emailAddress;
    }
}
