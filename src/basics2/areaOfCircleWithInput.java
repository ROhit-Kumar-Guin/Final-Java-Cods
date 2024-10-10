package basics2;

import java.util.Scanner;

public class areaOfCircleWithInput {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double rad = scan.nextDouble();
        double area = 3.14*rad*rad;
        System.out.print("Area of the circle is : "+area);
    }
}
