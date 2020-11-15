package Initialization_Blocks;

public class Employee {
    private static int nextId;
    private int id;
    private String name;
    private double salary;
    // object initialization block
    {
        id = nextId;
        nextId++;
    }
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }
    public Employee()
    {
        name = "";
        salary = 0;
    }

    void show(){
        System.out.println(name + salary + id);
    }
}
