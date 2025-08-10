package daily_tasks;

import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int []arr, int low, int high){
        if(low<high){
            int pivot=partition(arr, low, high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    public static int partition(int []arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        System.out.println("enter the elements of the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        quicksort(arr,0,n-1);
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
