import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        System.out.println(list);

        int a = list.get(1);
        System.out.println(a);

        list.add(1, 4);
        System.out.println(list);

        System.out.println(list.contains(4));

        list.remove(1);
        System.out.println(list);

        list.set(2, 6);
        System.out.println(list);

        list.set(0,9);
        System.out.println(list);


        list.add(8);
        list.add(17);
        System.out.println(list);

        System.out.println("Size of ArrayList : "+ list.size());


        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.print("ArrayList in resverse : ");
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


    }
}