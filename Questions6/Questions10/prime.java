import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        System.out.println("Enter ");
        Scanner v1 = new Scanner(System.in);
        int number = v1.nextInt();
        for (int i = 1; number > i; i++) {
            if (number > 2){
                if(number%i==0){
                    System.out.println("The number is not prime "+number);
                    System.out.println("The factors are "+i);
                    
                }


            }
            else{
                System.out.println("There is no factors are");
                System.out.println("The is prime"+number);
            }
        }
    }
}