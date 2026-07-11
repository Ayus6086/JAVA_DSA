import java.util.*;
public class PracticeSet13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Employee [] e = new Employee[n];
        for(int i=0;i<e.length;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name  = sc.nextLine();
            int agee = sc.nextInt();
            sc.nextLine();
            char gen = sc.nextLine().charAt(0);
            double sal = sc.nextDouble();
            e[i] = new Employee(id, name, agee, gen,sal);
        }
        int searchAge = sc.nextInt();
        Employee secSal = getEmployeeWithSecondLowestSalary(e);
        if(secSal!=null){
            System.out.println(secSal.getEmpId() +"#"+secSal.getEmpName());
        }else{
            System.out.println("Null");
        }
        int count = countEmployeesBasedOnAge(e, searchAge);
        if(count>0){
            System.out.println(count);
        }else{
            System.out.println("No employee found for the given age");
        }
    }
    public static Employee getEmployeeWithSecondLowestSalary(Employee[] e){
        if(e.length <2){
            return null;
        }
        for(int i=0;i<e.length-1;i++){
            for(int j=0;j<e.length-i-1;j++){
                if(e[j].getSalary()>e[j+1].getSalary()){
                    Employee temp = e[j];
                    e[j] = e[j+1];
                    e[j+1] = temp;
                }
            }
        }
        return e[1];
    }
    public static int countEmployeesBasedOnAge(Employee e[], int age){
        int count = 0;
        for(Employee a:e){
            if(a.getAge()==age){
                count++;
            }
        }
        return count;
    }
}
class Employee{
    private int empId;
    private String empName;
    private int age;
    private char gender;
    private double salary;
    public int getEmpId(){
        return empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public Employee(int empId, String empName, int age, char gender, double salary){
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

}