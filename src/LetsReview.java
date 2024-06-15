import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LetsReview {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(bufferedReader.readLine().trim());

            if (T >= 1 && T <= 10) {
                List<String> inputStringList = getInputStringList(T, bufferedReader);
                for (String s : inputStringList) {
                    String result = findOutEvenAndOddIndexedCharacters(s);
                    System.out.println(result);
                }
            } else {
                System.out.println("Invalid Test Case Limit. Please enter a value between 1 and 10");
            }
        } catch (NumberFormatException numberFormatEx) {
            System.out.println("Enter a valid Integer value.");
        } catch (Exception ex) {
            System.out.println("Enter a valid number.");
        }
    }

    private static String findOutEvenAndOddIndexedCharacters(String s) {
        String result = "";
        if (s.length() >= 2 && s.length() <= 10000) {
            List<String> characterList = List.of(s.split(""));
            String evenIndexString = "";
            String oddIndexString = "";
            for (int i = 0; i < s.length(); i++) {
                if ((i % 2) == 0) {
                    evenIndexString = evenIndexString.concat(characterList.get(i));
                } else {
                    oddIndexString = oddIndexString.concat(characterList.get(i));
                }
            }
            result = evenIndexString.concat(" ").concat(oddIndexString);
            return result;
        } else {
            return "Invalid String Length. Please enter a string of length between 2 & 10000";
        }
    }

    private static List<String> getInputStringList(int T, BufferedReader bufferedReader) {
        int i = 0;
        List<String> inputStringList = new ArrayList<>();
        while (i < T) {
            String s = "";
            try {
                s = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println("Enter a valid string.");
            }
            inputStringList.add(s);
            i++;
        }
        return inputStringList;
    }
}
