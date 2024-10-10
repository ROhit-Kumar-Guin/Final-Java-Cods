package basics2;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i=0 ; i<=n ; i++){
            if(isArmstrong(i)) System.out.println(i);
        }
        scan.close();
    }
    public static boolean isArmstrong(int n){
        int temp , last=0 , digit=0 , sum=0;
        temp=n;
        while(n>0){
            
            n=n/10;
            digit++;
        }
        temp=n;
        while (temp>0) {
            last%=10;
            sum+=Math.pow(last, digit);
            temp/=10;
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
}
