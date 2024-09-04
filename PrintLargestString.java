//Largest string is printing on the basis of the first letter
public class PrintLargestString{
    public static void main(String[] args) {
        String [] colour = {"Red","Yellow","Blue","Voilet","Black","Grey"};
        String largest = colour[0];
        for(int i=1;i<colour.length;i++){
            if(largest.compareTo(colour[i])<0){
                largest = colour[i];
            }
        }
        System.out.println(largest);
    }
}