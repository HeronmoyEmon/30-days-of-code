import java.util.*;

public class DictionariesAndMaps {
    private static final int MIN_ENTRIES = 1;
    private static final int MAX_ENTRIES = 100000;
    private static final int PHONE_NUMBER_LENGTH = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left after nextInt()

        if (n < 1 || n > MAX_ENTRIES) {
            System.out.println("The number of entries (n) should be between 1 and " + MAX_ENTRIES + ".");
            scanner.close();
            return;
        }

        Map<String, Integer> phonebookMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left after nextInt()

            // Validate phone number length
            if (String.valueOf(phone).length() != PHONE_NUMBER_LENGTH) {
                System.out.println("Phone number must be 8 digits long.");
                scanner.close();
                return;
            }

            phonebookMap.put(name, phone);
        }

        while (scanner.hasNext()) {
            String name = scanner.next();
            if (phonebookMap.containsKey(name)) {
                int phone = phonebookMap.get(name);
                System.out.println(name + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }

}
