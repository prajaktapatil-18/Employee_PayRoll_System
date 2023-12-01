import java.util.ArrayList;

public class PayrollSystem {

    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        employeeList = new ArrayList<>();


    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);


    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee emp : employeeList) {
            if (emp.getId()==id){
                employeeToRemove = emp;
                break;

            }



        }
        if (employeeToRemove != null){
            employeeList.remove(employeeToRemove);

        }

    }
    public void showEmployee(){

        for (Employee emp :employeeList){
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        PayrollSystem ps = new PayrollSystem();
        FullTimeEmployee ft = new FullTimeEmployee("ram", 22,3432.3);
        PartTimeEmployee pt = new PartTimeEmployee("ram",23,5,2000);

        ps.addEmployee(ft);
        ps.addEmployee(pt);
        System.out.println("initial employee details ");
        ps.showEmployee();
        System.out.println("removing 22 id ");
        ps.removeEmployee(22);
        System.out.println("remmaning student");
        ps.showEmployee();
    }
}

