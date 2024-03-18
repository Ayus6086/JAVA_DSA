import java.util.Date;
public class Date_Class{
    public static void main(String[] args) {
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);//Current Time and date
        System.out.println(d.getDate());
        System.out.println(d.getYear());
    }
}