package Exercise;
public class SalariedEmployee extends Employee {
    private int salary;

    public void setSalary(int salary){
        this.salary = salary;
    }

    public SalariedEmployee(String name, String afm, int salary){
        setName(name);
        setAfm(afm);
        setSalary(salary);
    }

    int payment(){
        return salary;
    }
}
