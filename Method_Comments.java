/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eksplorasi;

import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class Method_Comments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee = new Employee("Rifa", 3000, 2023, 4, 15);
        System.out.println("Karyawan "+employee.getName()+" mendapat gaji "
                            +employee.getSalary()+" dan masuk tanggal "+employee.getHire_date());
    }
    
}

class Employee{
    private String name;
    private LocalDate hire_date;
    private double salary;
        
    public Employee(String _name, double _salary, int year, int month, int day){
        name = _name;
        salary = _salary;
        hire_date = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }
        
   public LocalDate getHire_date() {
        return hire_date;
   }

    public double getSalary() {
        return salary;
    }
   
   /**
    * Raises the salary of an employee.
    * @param byPercent the percentage by which to raise the salary (e.g. 10 means 10%)
    * @return the amount of the raise
    */
    public double raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
        return raise;
    }
}
