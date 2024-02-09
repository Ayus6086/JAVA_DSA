public class MultiDimen {
    public static void main(String[] args) {
        int [] [] hotels;
        hotels = new int [2][2];
        hotels[0][0] = 100;
        hotels[0][1] = 200;
        hotels[1][0] = 300;
        hotels[1][1] = 400;
        for(int i=0; i<hotels.length ; i++){
            for(int j=0; j<hotels[i].length; j++){
                System.out.print(hotels[i][j]);
                System.out.print(" ");
        }
        System.out.println("\n");
    }
}
}