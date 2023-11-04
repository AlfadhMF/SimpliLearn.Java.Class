package Class2.OOPS;

public class Employee {

    String Name;
    int EmpID;
    private int Salary;

    public void Display(){

        System.out.println("Name of the employee is: "+Name);
        System.out.println("ID of the employee is: "+EmpID);
        System.out.println("Salary of the employee is: "+Salary);
    }

    public void Salary(int sal){

        Salary = sal;
    }

    //Default cons
    public Employee(){
        System.out.println("Inside Default constructor");
    }

    public Employee (String name, int EmpID, int Salary){

        this.Name = name;
        this.EmpID = EmpID;
        this.Salary = Salary;

    }



}


