package daily_tasks;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main (String []args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the elements of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = arr[0] / arr[1];
            System.out.println("result is " + result);
            System.out.println(arr[n + 1]);
        }
        catch (ArithmeticException e){
            System.out.println("division is done by 0");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("accessing index out of bound");
        }
    }
}
