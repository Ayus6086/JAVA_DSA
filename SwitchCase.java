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

            //Instead of break you can use  ' -> '

        // String days = "Fridy";
        // switch(days){
        //     case "Monday", "Tuesday", "Friday", "Saturday", "Sunday" -> System.out.println("NO class");
        //     case "Wednesday" -> System.out.println("Class - 8pm - 9pm");
        //     case "Thursday" -> System.out.println("Class - 7pm - 9pm");
        //     default -> System.out.println("Wrong input");
        // }

        //Instead of break you can use '-> '
            String days = "Sunday";
            String output = switch(days) {
            case "Monday", "Tuesday", "Saturday", "Sunday" : yield("No class");
            case "Wednesday" : yield("Class - 8pm - 9pm");
            case "Thursday", "Friday" : yield("Class - 7pm - 9pm");
            default : yield("Invalid output ");
        };
        System.out.println(output);
    }

    //----These are the 3 ways to write the break method-----
}