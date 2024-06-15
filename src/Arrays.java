import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Arrays {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            if (validateArraySize(n)) {
                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                if (validateElementCount(n, arr)) {
                    validateElementValueAndPrintReversedArray(arr);
                }
            } else {
                System.out.println("Array Size should be between 1 & 1000");
            }
        } catch(NumberFormatException numberFormatEx) {
            System.out.println("Enter a valid Integer value.");
        } catch (Exception ex) {
            System.out.println("Enter a valid number.");
        }
    }

    private static boolean validateArraySize(int n) {
        return n >= 1 && n <= 1000;
    }

    private static boolean validateElementCount(int n, List<Integer> arr) {
        if (arr.size() != n) {
            System.out.println("Input mismatch! Please input " + n + " number of elements.");
            return false;
        } else {
            return true;
        }
    }

    private static void validateElementValueAndPrintReversedArray(List<Integer> arr) {
        if (arr.stream().allMatch(element -> element >= 1 && element <= 10000)) {
            Collections.reverse(arr);
            System.out.println(arr.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        } else {
            System.out.println("Element value limit out of range. Please enter a value between 1 & 10000.");
        }
    }
}
