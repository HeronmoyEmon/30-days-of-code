import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class ConditionalStatements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(bufferedReader.readLine().trim());

            if (N >= 1 && N <= 100) {
                if(N % 2 == 0) {
                    handleEvenNumber(N);
                } else {
                    System.out.println("Weird");
                }
            } else {
                System.out.println("Input Number should be in the inclusive range of 1 to 100");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Enter a Valid Number");
        } finally {
            bufferedReader.close();
        }
    }

    private static void handleEvenNumber(int N) {
        if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
