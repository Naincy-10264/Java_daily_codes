package daily_tasks;

import java.util.Scanner;

public class ExceptionMethod extends Exception{
    ExceptionMethod(String s){
        super(s);
    }
    @Override
    public String toString(){
        return "balance should be greater than 5000";
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the balance");
        int balance=sc.nextInt();
        try {
            if (balance < 5000) {
                throw new ExceptionMethod("balance is to low");
            }
            else{
                System.out.println("its ok your balance is sufficient");
            }
        }
        catch (ExceptionMethod e){
            System.out.println("getMessage: "+e.getMessage());
            System.out.println("toString: "+e);
            System.out.print("printStackTrace: ");
            e.printStackTrace();
        }

    }
}
