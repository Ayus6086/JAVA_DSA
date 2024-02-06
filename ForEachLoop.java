public class ForEachLoop{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(arr.length);//Length of the array
        for(int i=0; i<arr.length; i++){
            System.out.println("In Serial Number: "+ arr[i]);
        }
        for(int i=arr.length -1 ; i>=0; i--){
            System.out.println("In reverse Order: "+ arr[i]);
        }
        System.out.println("For-Each loop");
        for(int i: arr){
            System.out.println("In Serial Number: "+ i);
        }
    }
}