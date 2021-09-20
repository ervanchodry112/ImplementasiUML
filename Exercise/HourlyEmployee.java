package Exercise;
public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private int hourlyPayment;

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    public HourlyEmployee(String name, String afm, int hours, int paid){
        setName(name);
        setAfm(afm);
        setHourlyPayment(hours);
        setHoursWorked(paid);
    }

    int payment(){
        return getHourlyPayment()*getHoursWorked();
    }
}
