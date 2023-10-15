import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = sc.nextInt();
        int tax;
        int total_income;
        if (income <= 500000) {
            tax = 0;
            total_income = income - tax;
            System.out.println("total income is " + total_income + " and your paid tax is " + tax);

        } else if (income > 500000 && income < 1000000) {
            tax = (int) (income * 0.2);
            total_income = income - tax;
            System.out.println("total income is " + total_income + " and your paid tax is " + tax);
        } else {
            tax = (int) (income * 0.3);
            total_income = income - tax;
            System.out.println("total income is " + total_income + " and your paid tax is " + tax);
        }
    }
}
