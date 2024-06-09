import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scanner = new Scanner(System.in);

        i = scanner.hasNextInt() ? i + scanner.nextInt() : i;
        d = scanner.hasNextDouble() ? d + scanner.nextDouble() : d;
        scanner.nextLine();
        s = scanner.hasNextLine() ? s + scanner.nextLine() : s;

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
