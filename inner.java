import java.util.*;

public class inner {
    public static int largestSearch(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println(largestSearch(numbers));
    }

}
