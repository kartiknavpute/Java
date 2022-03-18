// The Problem is basecd on 3n+1 concept
// Here we one Scanner functions
// karik
import java.util.Scanner;

public class questions {
    private static final Object[] Array = null;

    public static void main(String args[]) {
        System.out.println(" This is 3n+1 Problem..");

        System.out.println("Enter a Number ");
        Scanner v1 = new Scanner(System.in);
        int nummber = v1.nextInt();
        while (nummber != 1 && nummber != 2) {
            if (nummber % 2 == 0) {

                nummber = nummber / 2;
                // System.out.println("Answer is" + nummber);

            } else {
                nummber = (3 * nummber) + 1;

            }
            System.out.println("Answer is " + nummber);
        }
    }

}
