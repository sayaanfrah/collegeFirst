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

    public static void main(String[] args) {
        int numbers[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int target = 19;
        System.out.println(target + " is at index value  " + linearSearch(numbers, target));
        reversed(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}