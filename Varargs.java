public class Varargs{
    static int sum(int ...arr){
            int result = 0;
            for (int a : arr){
                result += a;
            }
            return result;
        }
    public static void main(String[] args) {
        
        System.out.println("Add os 4 and 5: "+ sum(4, 5));
        System.out.println("Add os 4,5 and 6: "+ sum(4,5,6));
    }
}