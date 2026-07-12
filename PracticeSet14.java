import java.util.*;
public class PracticeSet14{
    public static ArrayList<String> getTopStudentBySubject(Student[] arr, String subject){
        ArrayList<Student> list = new ArrayList<>();
        for(Student s: arr){
            if(s.getSubject().equalsIgnoreCase(subject)){
                list.add(s);
            }
        }
        if(list.size()==0){
            return new ArrayList<>();
        }
        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getMarks(), s1.getMarks());
            }
        });
        ArrayList<String> result = new ArrayList<>();

        for (Student s : list) {
            result.add(s.getStudentName());
        }

        return result;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student [] arr = new Student[5];
        for(int i=0;i<arr.length;i++){
            int studentId = sc.nextInt();
            sc.nextLine();
            String studentName = sc.nextLine();
            double marks = sc.nextDouble();
            sc.nextLine();
            String subject = sc.nextLine();
            arr[i] = new Student(studentId, studentName, marks, subject);
        }
        String searchSubject = sc.nextLine();

        ArrayList<String> ans = getTopStudentBySubject(arr, searchSubject);

        if (ans.size() == 0) {
            System.out.println("No students found");
        } else {
            for (String name : ans) {
                System.out.println(name);
            }
        }
    }
}
class Student{
    private int studentId;
    private String studentName;
    private double marks;
    private String subject;
    public Student(int studentId, String studentName, double marks, String subject) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
        this.subject = subject;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks = marks;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public char getGrade(){
        if(marks>=90){
            return 'A';
        }else if(marks>=75){
            return 'B';
        }else if(marks>=60){
            return 'C';
        }else if(marks>=50){
            return 'D';
        }else{
            return 'F';
        }
    }
}