public class BreakAndContinue{
    public static void main(String[] args) {
        //Break and continue using loops----
        // for (int i=0; i<5;i++){
        //     System.out.println(i);
        //     System.out.println("Hello");
        //     if(i==3){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }
        for (int i=0; i<5;i++){
            if(i==3){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello");
        }
        
    }
}