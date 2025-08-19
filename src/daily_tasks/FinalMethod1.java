package daily_tasks;

import java.util.Scanner;

public class FinalMethod1 {
    public static class negativeDimensionException extends  Exception{
        negativeDimensionException(){
            System.out.println("dimensions can't be negative");
        }
    }
    public static int area(int a, int b)throws negativeDimensionException{
        try {
            if (a < 0 || b < 0) {
                throw new negativeDimensionException();
            }
        }
        finally {
            System.out.println("final message");
        }
        return a*b;
    }
    public static  void main(String []args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length and breadth of rect");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println(area(a, b));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
