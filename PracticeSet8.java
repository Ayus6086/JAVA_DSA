class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String nam){
        name = nam;
    }
}
public class PracticeSet8{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Ayush";
        e1.salary= 1200;
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
        e1.setName("John");
        System.out.println(e1.getName());
        
    }
}