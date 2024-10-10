package basics2;
import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        double p = scan.nextDouble();
        double r = scan.nextDouble();
        double t = scan.nextDouble();
        
        double si=(p*r*t)/100 ;
        System.out.println("The simple interest is : "+si);
    }
}
