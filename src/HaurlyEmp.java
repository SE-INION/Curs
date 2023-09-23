public class HaurlyEmp extends Employee {
    private double hourshorred;
    private double hourlarate;

    public HaurlyEmp(String name,double hourshorred, double hourlarate) {
        super(name);
        this.hourshorred = hourshorred;
        this.hourlarate = hourlarate;
    }

    @Override
    public double calculateSalary() {
        return hourshorred*hourlarate;
    }
}
