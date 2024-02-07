//Encapsution is process of wapping data members and member  function together in a single unit
class Bank{
    private String accName = "Ayush";
    private int accNo = 123456;//instant variable
    private int accbalance = 100;
    
    public String getAccName() {
        return accName;
    }
    public int getAccNo() {
        return accNo;
    }
    public int getaccbalance() {
        return accbalance;
    }
    public void setaccbalance(int val) {
        accbalance = val;
    }
    public void setaccName(String name){
        accName = name;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Bank obj = new Bank();
        System.out.println(obj.getAccName());
        System.out.println(obj.getAccNo());
        System.out.println(obj.getaccbalance());
        obj.setaccbalance(50);  
        System.out.println(obj.getaccbalance());
        obj.setaccName("Harsh");
        System.out.println(obj.getAccName());
    }
}