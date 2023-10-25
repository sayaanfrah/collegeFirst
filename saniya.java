import java.util.*;

public class saniya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddSum = 0;
        do {
            System.out.println("enter any positive value for n");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddSum += number;
            }
            System.out.println("For proceedidng Select 1 to Proceed and 0 to not Proceed");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("the sum of even numbers is " + evensum);
        System.out.println("The sum of odd number is " + oddSum);

    }
}
