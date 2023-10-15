import java.util.*;

public class leap {
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

    public static void main(String[] args) {
        int numbers[] = { 11, 12, 13, 14, 15, 16, 7, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 };
        int target = 28;
        System.out.println(target + " Is at INdex " + linearSearch(numbers, target));

    }
}