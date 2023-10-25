import java.util.*;

public class oen {
    public static int linearSearch(int numbers[], int target) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                return mid;

            }
            if (numbers[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reversed(int numbers[]) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    public static int largestSearch(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int target = 19;
        // System.out.println(target + " is at index value " + linearSearch(numbers,
        // target));
        // // reversed(numbers);
        // // for (int i = 0; i < numbers.length; i++) {
        // // System.out.print(numbers[i] + " ");
        // // }
        // // System.out.println();

        // largestSearch(numbers);
        // System.out.println("The largest number is " + largestSearch(numbers));
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
