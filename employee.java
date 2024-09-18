class Company {
    void work() {
        System.out.println("Company is working");
    }

    double getSalary() {
        return 50000.00; 
    }
}
class HR extends Company {
    @Override
    public void work() {
        System.out.println("HR Manager is working");
    }
    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
    public void addSalary() {
        System.out.println("Salary is increasing");
    }
}

public class employee {
    public static void main(String[] args) {
        Company company = new Company();
        company.work(); 
        System.out.println("Company Salary: " + company.getSalary()); 
        HR hrManager = new HR();
        hrManager.work(); 
        System.out.println("HR Manager Salary: " + hrManager.getSalary()); 
        hrManager.addEmployee(); 
        hrManager.addSalary(); 
    }
}
