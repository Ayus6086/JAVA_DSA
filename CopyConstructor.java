//A constructor that creates an object using another object of the same Java class.
class Student{
    String name;
    int age;
    public void StudentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        
    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}

public class CopyConstructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.StudentInfo();
    }
}