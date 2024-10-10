import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0 ; i<n ; i++) {
            System.out.print("Enter the element of the array : ");
            arr[i] = scan.nextInt();
        }



         
    }
}
// package Arrays.assignement;

// import java.util.*;

// public class q4 {
//     public static void main(String[] args) {
//         @SuppressWarnings("resource")
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the size of the array : ");
//         int n = scan.nextInt();
//         int[] arr = new int[n];
//         for (int i=0 ; i<n ; i++) {
//             System.out.print("Enter the element of the array : ");
//             arr[i] = scapn.nextInt();
//         }



//         ArrayList<Integer> ans = new ArrayList<>();
//         int temp = Integer.MIN_VALUE;
//         for(int i=0 ; i<n-1 ; i++){
//             if(arr[i] == temp){
//                 continue;
//             }
//             for(int j=i+1 ; j<n ; j++){
                
//                 if(arr[i]==arr[j]){
//                     ans.add(arr[i]);
//                     for(int k=i ; k<n ; k++){
//                         if(arr[k] == arr[i]){
//                             arr[k] = temp;
//                         }
//                     }
//                 }
//             }
//         }
    

        
//         // for(int i=0 ; i<n-1 ; i++){
//         //     for(int j=i+1 ; j<n ; j++){
                
//         //         if (arr[i] == arr[j]) {
//         //             ans.add(arr[i]);
//         //             break;
//         //         }
//         //     }
//         //     System.out.println(ans);
//         // }


//     }
// }
