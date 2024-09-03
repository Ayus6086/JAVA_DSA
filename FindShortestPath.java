public class FindShortestPath{
    public static float getShortestPath(String str){
        int x =0, y=0;
        for(int i=0;i<str.length();i++){
            //SOUTH
            if(str.charAt(i)=='S'){
                y--;
            }
            //NORTH
            else if(str.charAt(i)== 'N'){
                y++;
            }
            //WEST
            else if(str.charAt(i)== 'W'){
                x--;
            }
            //EAST
            else if(str.charAt(i)== 'E'){
                x++;
            }
            else{
                System.out.println("Invalid input");
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(getShortestPath(str));
    }
}