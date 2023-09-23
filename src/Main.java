public class Main {
    public static void main(String[] args) {
        HaurlyEmp haurlyEmp=new HaurlyEmp("BAijigit",5,10000);
        System.out.println(haurlyEmp.calculateSalary());
        SalariedEmp salariedEmp=new SalariedEmp("BAIJIGIT",10000);
        System.out.println(salariedEmp.calculateSalary());
    }
}