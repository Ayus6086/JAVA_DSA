public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("----SWITCH CASE----");
        // int day = 8;
        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid day");
        // }

        String days = "Friday";
        switch(days){
            case "Monday":
                System.out.println("NO class");
                break;
            case "Tuesday":
                System.out.println("NO class");
                break;
            case "Wednesday":
                System.out.println("Class - 8pm - 9pm");
                break;
            case "Thursday":
                System.out.println("Class - 7pm - 9pm");
                break;
            case "Friday":
                System.out.println("Class - 7pm - 9pm");
                break;
            case "Saturday":
                System.out.println("Holiday");
                break;
            case "Sunday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Wrong input");
        }

    }
}