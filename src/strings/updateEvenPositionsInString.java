package strings;
import java.util.*;

public class updateEvenPositionsInString {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name : ");
        String str = scan.nextLine();
        String s ="";
        for(int i=0 ; i<str.length() ; i++){
            if(i%2==0){
                s += 'a';
            }
            else{
                s += str.charAt(i);
            }
        }
        
        str = s;
        System.out.print(str);
        
    }
}
