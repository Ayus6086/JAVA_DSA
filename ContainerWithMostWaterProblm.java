import java.util.*;
public class ContainerWithMostWaterProblm{
    //brute force approach ---> TC : O(n^2)
    public static int storedWater(ArrayList<Integer> water){
        int maxWater = 0;
        for(int i=0;i<water.size();i++){
            for(int j=i+1;j<water.size();j++){
                int ht = Math.min(water.get(i),water.get(j));
                int width = j-i;
                int area = ht*width;
                maxWater = Math.max(maxWater,area);
            }
        }
        return maxWater;
    }
    //optimal approach ---> TC : O(n)
    public static int storeWtr(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size() -1;
        while(lp<rp){
            int het = Math.min(height.get(lp), height.get(rp));
            int wid = rp-lp;
            int mw = het*wid;
            maxwater = Math.max(maxwater, mw);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
            maxwater = Math.max(maxwater, mw);
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> water = new ArrayList<>();
        water.add(1);
        water.add(8);
        water.add(6);
        water.add(2);
        water.add(5);
        water.add(4);
        water.add(8);
        water.add(3);
        water.add(7);

        System.out.println(storedWater(water));
        System.out.println(storeWtr(water));
        
    }
}