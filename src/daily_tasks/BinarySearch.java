package daily_tasks;

import java.util.Scanner;

public class BinarySearch {
    public static void binarysearch(int []arr, int a){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(a<arr[mid]){
                high=mid-1;
            }
            else if(a>arr[mid]){
                low=mid+1;
            }
            else if(a==arr[mid]){
                System.out.println("element founded at "+mid+" position");
                break;
            }
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element want to be searched");
        int a= sc.nextInt();
        binarysearch(arr,a);
    }
}
