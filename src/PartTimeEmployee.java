public class PartTimeEmployee extends Employee {


    private  int hr ;
    private  double hourlyRate;

    public PartTimeEmployee(String name , int id, int hr, double hourlyRate){
        super(name, id);
        this.hr = hr;
        this.hourlyRate = hourlyRate;



    }


    @Override
    public double calculateSalary() {
        return hr*hourlyRate;


    }


}
