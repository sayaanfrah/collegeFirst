import java.util.*;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
        } while (true);

    }
}