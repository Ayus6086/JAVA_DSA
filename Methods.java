public class Methods{
    static void Talk(){
        System.out.println("Hello Everyone!. I'm Monster");
    }
    static int logic(int a, int b){
            int z;
            if (a > b){
                z = a-b;
            }
            else{
                z = b-a;
            }
            return z;
        }
    public static void main(String[] args) {
        Methods obj = new Methods();
        int c;
        c = obj.logic(19, 13);
        System.out.println(c);
        Talk();
    }
}