package sorting.bubbleSort;

public class CheckWhetherArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {1,2,3,5,4,5,33,55,98};
        boolean flag = true;
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                flag = false ;
                break;
            }
        }
        if(flag == false){
            System.out.println("Unsorted");
        }else{
            System.out.println("Sorted");
        }
    }
}
