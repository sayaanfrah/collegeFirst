import java.util.*;

public class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter a positive Integer");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("TO proceed further press 1 and to cancel press 0 ");
            choice = sc.nextInt();

        } while (choice == 1);
        System.out.println("The sum of even integers is" + evenSum);
        System.out.println("The sum of odd integer is" + oddSum);
    }
}
