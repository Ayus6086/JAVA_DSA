//Polymorphism allows us to perform a single action in different ways.
class Employee{
    String name;
    int salary;
    public void EmployeeInfo(String name){
        System.out.println(name);
    }
    public void EmployeeInfo(int salary){
        System.out.println(salary);
    }
    public void EmployeeInfo(String name, int salary){
        System.out.println(name + " " + salary);
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "James";
        e1.salary = 30000;
        e1.EmployeeInfo(e1.name);
        e1.EmployeeInfo(e1.salary);
    }
}