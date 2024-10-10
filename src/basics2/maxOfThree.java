package basics2;
import java.util.*;

public class maxOfThree {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        double num1 = scan.nextDouble();
        System.out.print("Enter 2nd number : ");
        double num2 = scan.nextDouble();
        System.out.print("Enter 3rd number : ");
        double num3 = scan.nextDouble();

        if (num1>num2 && num1>num3) {
            System.out.println(num1+" is greatest!!");
        }
        else if (num2>num1 && num2>num3) {
            System.out.println(num2+" is greatest!!");
        }
        else{
            System.out.println(num3+" is greatest!!");
        }
    }
}
