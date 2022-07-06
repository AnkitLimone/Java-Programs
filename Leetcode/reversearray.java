import java.util.*;

class reversearr{
    static void reversearray(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
    static void printarr(int arr[], int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        
            
        }
    }

    public static void main(String args[]) {
        int arr[] ={1,2,3,4,5,6};
        printarr(arr, 6);
        reversearray(arr, 0, 5);
        System.out.println("Reversed Array is ");
        printarr(arr, 6);

    }
}
