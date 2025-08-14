package daily_tasks;

import java.util.Scanner;

public class LineraSearch {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number want to search");
        int a=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                System.out.println("element found at "+i+" position");
            }
        }
    }
}
