package Practice.Questions6.Questions10;

import java.util.Scanner;

public class lightmorelight {
    public static void main(String args[]) {
        Scanner v1 = new Scanner(System.in);
        System.out.print("Enter No of Bulbs ");
        int bulbs = v1.nextInt();
        System.out.print("Enter no of rounds ");
        int round = v1.nextInt(), i;
        for (int j = 1; bulbs > j; j++) {
            for (i = 1; round > i; i++) {
                if (j % i == 0) {
                    System.out.println("Changed the operations bulb no " + j + " and raund no is " + i);
                    
                } else {
                    System.out.println("No Changed in the operations bulb no " + j + " and raund no is " + i);
                }
            }
            if (bulbs % i == 0) {
                System.out.println("Last bulb is on");
                
            } else {
                System.out.println("Last bulb is not change");
            
            }
            
        
        }
        
    }
}