package practice;

public class secMaxInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,8,12,4,6,23,9};
        int max = arr[0];
        int sec_max = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                sec_max = max;
                max = arr[i];
            }
        }
        System.out.println("Max value : " + max);
        System.out.println("Sec max value : " + sec_max);
    }
}
