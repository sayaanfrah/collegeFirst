import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your income in Rupees");
        int income = sc.nextInt();
        int tax = 0;
        int total_income = 0;
        if (income < 500000) {
            tax = 0;
            total_income = income - tax;
            System.out.println("your total income after tax deduction is  " + total_income);
        } else if (income >= 500000 && income <= 800000) {
            tax = (int) (0.2 * income);
            total_income = income - tax;
            System.out.println("your total income after tax deduction is " + total_income);
        } else {
            tax = (int) (0.3 * income);
            total_income = income - tax;
            System.out.println("Your total income after tax dedcution is " + total_income);

        }

    }
}