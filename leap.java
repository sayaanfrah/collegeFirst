import java.util.*;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();

        boolean x = (year % 4 == 0);
        // boolean y = (year % 100) != 0;
        // boolean z = (year % 100 == 0) && (year % 400 == 0);
        if (x) {
            System.out.println(year + " it is a leap year");
        } else {
            System.out.println(year + " it is not a leap year");
        }

    }
}