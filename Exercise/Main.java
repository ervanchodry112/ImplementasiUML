package Exercise;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList <Employee> pekerja = new ArrayList<Employee>();
        Employee hourly = new HourlyEmployee("Budiman", "01325", 48, 2000);
        Employee daily = new SalariedEmployee("Putri", "01326", 50000);
        pekerja.add(hourly);
        pekerja.add(daily);

        for(int i = 0; i < pekerja.size(); i++){
            System.out.println("========== Data Pekerja ==========");
            System.out.println("Nama\t\t: "+pekerja.get(i).getName());
            System.out.println("No. AFM\t\t: "+pekerja.get(i).getAfm());
            System.out.println("Gaji\t\t: "+pekerja.get(i).payment());
            System.out.println();
        }
    }
}
