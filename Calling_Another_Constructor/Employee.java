package Calling_Another_Constructor;

public class Employee {

    private int id;
    private String name;

    public Employee(String aName, int aId){
        name = aName;
        id = aId;
    }

    public Employee(int aId){
        this("Employee #", aId);
    }

    public int getId() {
       return id;
    }
      
    public String getName() {
        return name;
    }
    void show(){
        System.out.println(name + "\n" + id);
    }
}
