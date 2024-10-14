package Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int i=0 , j=0 , k=0;
        while (i<n1 && j<n2) {
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            else if (arr1[i]>arr2[j]) {
                arr3[k] = arr2[j];
                k++;
                j++;
            } 
        }
        if (i == n1) {
            while (j<n2) {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        else if (j == n2) {
            while (i<n1) {
                arr3[k] = arr1[i];
                k++;
                i++;
            }
        }
        for (int ele : arr3) {
            System.out.print(ele);
        }




        


    }
}
