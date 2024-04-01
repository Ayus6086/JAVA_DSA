class Employee{
    private int id;
    private String name;
    public void setid(int i){
        id =i;
    }
    public int getid(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class GetterSetter{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setid(100);
        e1.setName("Mehta");
        System.out.println(e1.getid());
        System.out.println(e1.getName());
    }
}