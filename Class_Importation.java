
package Eksplorasi;

import java.time.LocalDate;

public class Class_Importation {
    public static void main(String[] args) {
       Employee employee = new Employee("Rifa", 2023, 4, 15);
        System.out.println("Karyawan "+employee.getName()+" masuk tanggal "+employee.getHire_date());
    }
    
}

class Employee{
    private String name;
    private LocalDate hire_date;
        
    public Employee(String _name, int year, int month, int day){
        name = _name;
        hire_date = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }
        
   public LocalDate getHire_date() {
        return hire_date;
   }
}
