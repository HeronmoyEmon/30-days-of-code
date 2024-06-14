import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            if (n >= 2 && n <= 20) {
                for (int i = 1; i <= 10; i++) {
                    int result = n * i;
                    System.out.println(n + " x " + i + " = " + result);
                }
            } else {
                System.out.println("Enter a Number between 2 & 20");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Enter a valid Integer Number.");
        } catch (Exception ex) {
            System.out.println("Invalid Input");
        }
    }
}
