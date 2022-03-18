package Practice.Questions6;
import java.util.Scanner;
public class Problem1 {
    // int mon;
    public static void main(String[] args){
        int money =0,credited =0;
    System.out.println("Enter Money you have");
    Scanner gc = new Scanner(System.in);
    int mon = gc.nextInt();
    Problem1 ebit = new Problem1();
    ebit.debit(25,45);
    ebit.debit(25);
    ebit.debit(0,45);
    ebit.debit();
    ebit.debit();
    
    }
    
    public void debit(int money,int credited){
        System.out.println("money is "+money);
        System.out.println("Creadited amount is "+credited);
    }
    public void debit(int credited){
        System.out.println("money is "+money);
        System.out.println("Creadited amount is "+credited);
    }
    public void debit(int money){
        System.out.println("money is "+money);
        System.out.println("Creadited amount is "+credited);
    }
    public void debit(){
        System.out.println("money is "+Program1.money);
        System.out.println("Creadited amount is "+Program1.credited);
    }
    public void debit(){
        System.out.println("money is "+Program1.money);
        // System.out.println("Creadited amount is ";
    }


}