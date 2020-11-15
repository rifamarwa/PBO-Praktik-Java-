package Excplicit_Field_Intialization;

public class Employee {
    private static int nextId;
    private int id = assignId();

    private static int assignId(){
        int r = nextId;
        nextId++;
        return r;
    }

    void show(){
        System.out.println(nextId);
    }
}
