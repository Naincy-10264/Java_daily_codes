package daily_tasks;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            swap(arr,i,smallest);
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        selectionsort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
