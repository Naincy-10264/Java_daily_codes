package daily_tasks;

import java.util.*;
public class Max_Element {
    public static int maximum(int[] arr){
        int temp = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []array=new int[n];
        System.out.println("enter the values in array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int result=maximum(array);
        System.out.println("maximum element in this array is "+result);
    }
}
