import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        Scanner scanner = new Scanner(System.in);
        String inputString = null;
        if (scanner.hasNextLine()) {
            inputString = scanner.nextLine();
        }
        scanner.close();

        System.out.println(inputString);
    }
}
