package basics2;
import java.util.*;

public class triangleOrNot {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 1st side : ");
        int side1= scan.nextInt();
        System.out.print("Enter 2nd side : ");
        int side2= scan.nextInt();
        System.out.print("Enter 3rd side : ");
        int side3= scan.nextInt();

        if ((side1+side2)>side3 || (side1+side3)>side2 || (side2+side3)>side1) {
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid tringle");
        }
    }
}
