package daily_tasks;

import java.util.Scanner;

public class Find_gcd {
    public static int gcd(int a, int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter you first number");
        int a=sc.nextInt();
        System.out.println("enter your second number");
        int b=sc.nextInt();
        int hcf=gcd(a,b);
        System.out.println("gcd of "+a+" "+b+" is "+hcf);
    }
}
