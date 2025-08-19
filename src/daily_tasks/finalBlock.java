package daily_tasks;

import java.util.Scanner;

public class finalBlock extends Exception{
    public static int area(int a, int b)throws Exception{
        try {
            if (a < 0 || b < 0) {
                throw new Exception();
            }
        }
        finally {
            System.out.println("final message");
        }
        return a*b;
    }
    public static  void main(String []args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and breadth of rect");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(area(a,b));
    }
}
