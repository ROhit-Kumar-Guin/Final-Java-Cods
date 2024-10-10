package basics2;
import java.util.*;

public class profitLoss {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the cost price : ");
        double cp = scan.nextDouble();
        System.out.print("Enter the Selling price : ");
        double sp = scan.nextDouble();
        if(cp>sp){
            System.out.println("LOSS");
            System.out.print("You have made a loss of " + (cp-sp));
        }
        else if (sp>cp) {
            System.out.println("PROFIT");
            System.out.print("You have made a PROFIT of " + (sp-cp));
        }
        else{
            System.out.println("NEITHER PROFIT NOR LOSS!!!");
        }

    }
}
