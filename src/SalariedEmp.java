public class SalariedEmp extends Employee{
    private double monthlySalary;

    public SalariedEmp(String name,double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
