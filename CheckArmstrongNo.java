import java.lang.Math;
public class CheckArmstrongNo{
    static boolean isArmstrong(int n){
        int temp, digits=0, sum=0, last=0;
        temp = n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp = n;
        while(temp>0){
        last=temp%10;
        sum += (Math.pow(last, digits));
        temp = temp/10;
    }
    if(sum==n)
        return true;
    else
        return false;
    
    }
    public static void main(String[] args) {
        int num = 154;
        if (isArmstrong(num)){
            System.out.println(num+" is an Armstrong number");
        }
        else{
            System.out.println(num+" is not an Armstrong number");
        }
    }
}

