public class MethodOverloading{
    static void College(){
        System.out.println("My college name is LPU");
    }
    static void College(int students)//Parameters
    {
        System.out.println("No. of students in my college are: "+ students);
    }
    static void College(int fees, float cgpa)//Parameters
    {
        System.out.println("my college fees are: "+ fees + ", cgpa: "+ cgpa);
    }
    public static void main(String[] args) {
        College();//Arguments are actual
        College(100000);
        College(700000, 4.5f);
    }
}