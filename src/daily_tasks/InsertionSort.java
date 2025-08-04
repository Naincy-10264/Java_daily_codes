package daily_tasks;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        for(int i=1;i< arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }


    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the element of the array");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        insertionsort(arr);
        for(int nums:arr){
            System.out.print(nums);
        }
    }
}
