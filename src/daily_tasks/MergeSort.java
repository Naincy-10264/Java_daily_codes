package daily_tasks;

import java.util.Scanner;

public class MergeSort {
    public static void mergesort(int []arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void conquer(int []arr, int si, int mid, int ei){
        int []newArray=new int[ei-si+1];
        int ind1=si;
        int ind2=mid+1;
        int x=0;
        while(ind1<=mid && ind2<=ei){
           if(arr[ind1]<=arr[ind2]){
               newArray[x++]=arr[ind1++];
           }
           else{
               newArray[x++]=arr[ind2++];
           }
        }
        while(ind1<=mid){
            newArray[x++]=arr[ind1++];
        }
        while(ind2<=ei){
            newArray[x++]=arr[ind2];
        }
        for(int i=0, j=si;i< newArray.length;i++,j++){
            arr[j]=newArray[i];
        }
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        System.out.println("enter the elements of the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        mergesort(arr,0, arr.length-1);
        for(int nums:arr){
            System.out.print(nums);
        }
    }
}
