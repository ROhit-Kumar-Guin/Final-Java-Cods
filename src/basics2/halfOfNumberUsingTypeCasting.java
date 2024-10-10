package basics2;
import java.util.Scanner;

public class halfOfNumberUsingTypeCasting {
    public static void main(String[] args){
        
        try (Scanner scan = new Scanner(System.in)) {
            double num = scan.nextDouble();
            int y = (int)num;
            System.out.print(y/2);
        }

        // int num = scan.nextInt();
        // double y = (double)num;
        // System.out.print(y/2);



    }
}
