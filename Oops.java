class Student{
        String name ;
        int age;
        int roll_no;
        String college;
        public void info(){
            System.out.println(this.age);
            System.out.println(this.roll_no);
            System.out.println(this.college);
        }
    }
    public class Oops{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.roll_no = 39;
        s1.age = 25;
        s1.college = "LPU";
        s1.info();
    }
}